package write_read_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

public class RestoreEmployeeAppl {
    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./dest/employee.dat"))){

            HashSet<Employee> employees = (HashSet<Employee>) ois.readObject();

            employees.forEach(System.out::println);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
