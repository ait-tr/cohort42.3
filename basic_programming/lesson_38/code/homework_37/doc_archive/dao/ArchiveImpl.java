package homework_37.doc_archive.dao;

import homework_37.doc_archive.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive{

    // этот компаратор позволяет сортировать объекты типа Document сначала по дате, потом по ID документа
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate());
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };

    //fields
    private Document[] documents; // хранение документов в массиве
    private int size; // количество документов

    // constructor
    public ArchiveImpl(int capacity) {
        documents = new Document[capacity];
        // this.size = 0;
    }

    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || getDocFromFolder(document.getFolderId(), document.getDocumentId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        index = index >= 0 ? index : -index - 1; // нашли индекс, куда надо вставить элемент массива (документ)
        System.arraycopy(documents, index, documents, index + 1, size - index); // раздвинули массив
        documents[index] = document; // вставили документ
        size++; // увеличили размер хранилища
        return true;
    }

    @Override
    public boolean removeDocument(int folderId, int documentId) {
        // ищем фото
        for (int i = 0; i < size; i++) {
            if(documents[i].getFolderId() == folderId && documents[i].getDocumentId() == documentId){
                // надвигаем хвост массива на найденную позицию i удаляемого фото
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                // size--;
                documents[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, String url) {
        Document document = getDocFromFolder(folderId, documentId);
        if (document == null) {
            return false;
        }
        document.setUrl(url); // обновляем одно поле url
        return true;
    }

    @Override
    public Document getDocFromFolder(int folderId, int documentId) {
        Document pattern = new Document(folderId, documentId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(documents[i])) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocFromFolder(int folderId) {
        return findByPredicate(p -> p.getFolderId() == folderId); // передаем в метод findByPredicate сам предикат (условие для поиска)
        // p.getFolderId() == folderId
    }

    private Document[] findByPredicate(Predicate<Document> predicate) { // возвращаем массив найденных объектов
        Document[] res = new Document[size]; // объявили массив избыточной длины
        int j = 0; // это счетчик найденных документов
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j++] = documents[i];
                // j++;
            }
        }
        return Arrays.copyOf(res, j);//скопировали массив сам на себя, теперь он без элементов null
    }

    // Метод getDocumentBetweenDate использует Integer.MIN_VALUE в качестве значения documentId в объекте pattern,
    // чтобы найти левый край диапазона документов. Это делается для того, чтобы убедиться, что найденный индекс
    // всегда будет меньше или равен нулю, так как Arrays.binarySearch ожидает, что документы будут упорядочены в
    // массиве, и отрицательный индекс означает, что элемент не найден, но он мог бы быть вставлен в эту позицию.
    //
    //Использование 0 в качестве documentId в объекте pattern приведет к тому, что индекс, найденный с использованием
    // Arrays.binarySearch, будет означать точное совпадение с этим documentId, что не всегда верно, так
    // как documentId может быть неотрицательным числом.
    //
    //Итак, использование Integer.MIN_VALUE обеспечивает, что найденный индекс будет левым краем диапазона,
    // который вы хотите получить. В данном контексте Integer.MIN_VALUE служит специальным значением, которое
    // обозначает "нижнюю границу" для поиска, чтобы учесть все документы, начиная с заданной даты dateFrom.

    // O(n)
    @Override
    public Document[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        // O(1)
        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay()); // почему Integer.MIN_VALUE, а не 0
        //ввели объектную переменную, шаблон
        //O(log(n))
        int from = Arrays.binarySearch(documents, 0, size, pattern, comparator);//находим индекс начального фото левый край
        //O(1)
        from = from>=0 ? from : - from -1;
        // O(1)
        pattern = new Document(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));// находим
        // правый край
        // O(log(n))
        int to = Arrays.binarySearch(documents, 0, size, pattern, comparator);
        // O(1)
        to = to >=0 ? to : -to-1;
        // O(n)
        return Arrays.copyOfRange(documents, from, to);// диапазон, создаем новый массив с нужными документами
    }

    @Override
    public Document[] getDocBetweenDateTwo(LocalDate dateFrom, LocalDate dateTo) {
        Document[] docArray = new Document[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            LocalDateTime docDate = documents[i].getDate();
            if(docDate.isAfter(dateFrom.atStartOfDay()) && docDate.isBefore(dateTo.plusDays(1).atStartOfDay())) {
                docArray[j] = documents[i];
                j++;
            }
            return Arrays.copyOf(docArray, j);
        }
        return new Document[0];
    }

    @Override
    public int size() {
        return size;
    }

    public void viewArchive() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
        System.out.println("You have " + size + " documents.");
    }
}
