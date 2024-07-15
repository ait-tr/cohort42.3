package homework_47.doctors_spec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DoctorAppl {

//    public static void main(String[] args) {
//        List<Doctors> doctors = getDoctors();
//        System.out.println("============Most skilled Doctors===========");
//        printMostSkilledDoctors(doctors);
//
//        System.out.println("============Most popular specialties=============");
//        printMostPopularSpecialties(doctors);
//
//    }
//
//    private static void printMostPopularSpecialties(List<Doctors> doctors) {
//        System.out.println("===============Print all specialties===============");
//        Iterable<String> specialties = doctors.stream()
//                .map(p -> p.getSpecialties())
//                .flatMap(t -> Arrays.stream(t))
//                .collect(Collectors.toList());
//
//        System.out.println("==============Grouping By Doctors=============");
//        Map<String, Long> specialFrequency = doctors.stream()
//                .map(Doctors::getSpecialties)
//                .flatMap(Arrays::stream)
//                .collect(Collectors.groupingBy(t-> t,Collectors.counting()));
//
//        System.out.println(specialFrequency);
//
//        Long max = specialFrequency.values().stream()
//                .max(Long::compare).orElse(0L);
//
//        specialFrequency.entrySet().stream()
//                .filter(e->max.equals(e.getValue()))
//                .forEach(e-> System.out.println(e.getKey()));
//    }
//
//    private static void printMostSkilledDoctors (List < Doctors > doctors) {
//        Map<Integer, List<Doctors>> skilledDoctors = doctors.stream()
//                .collect(Collectors.groupingBy(p-> p.getSpecialties().length));
//        Integer max = skilledDoctors.keySet().stream()
//                .max(Integer::compareTo).orElse(0);
//        //Map<Integer, List<Doctors>> skilledDoctors = new Hashmap<>();
//
//        max = 0;
//        for (Doctors doctor : doctors) {
//            int key = doctors.getSpecialties().length;
//            max = key > max ? key : max;
//            skilledDoctors.putIfAbsent(key,new ArrayList<>());
//            List<Doctors> doctorsList = skilledDoctors.get(key);
//            doctorsList.add(doctor);
//        }
//        System.out.println(skilledDoctors);
//    }
//    private static List<Doctors> getDoctors(){
//        return List.of(
//                new Doctors("Anna","Therapist", "Dermatologist",
//                        new Doctors("Mark","Therapist", "Ophthalmologist",
//                                new Doctors("Jurgen","Dentist", "Surgeon",
//                                        new Doctors("Laura","Therapist", "Coordiologist",
//                                                new Doctors("Michael","Dentist", "Surgeon",
//                                                        new Doctors("Richard","Urologist", "Therapist"
//                                                        );
//
//    }

}
