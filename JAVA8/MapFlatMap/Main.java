package MapFlatMap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> citiesPreference1 = new ArrayList<>();
        List<String> citiesPreference2 = new ArrayList<>();
        List<String> citiesPreference3 = new ArrayList<>();

        citiesPreference1.add("London");
        citiesPreference1.add("Paris");
        citiesPreference1.add("Amsterdam");
        citiesPreference1.add("Grenoble");

        citiesPreference2.add("New Delhi");
        citiesPreference2.add("Pune");

        citiesPreference3.add("New York");
        citiesPreference3.add("Boston");
        citiesPreference3.add("New Jersey");

        Employee e1 = new Employee(1, "Rachita", citiesPreference1);
        Employee e2 = new Employee(2, "Ryan", citiesPreference2);
        Employee e3 = new Employee(3, "Rachel", citiesPreference3);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println(employees);

        // ArrayList<Integer> ids = new ArrayList<>();
        // for (Employee employee : employees) {
        // ids.add(employee.getId());
        // }

        // System.out.println(ids);
        List<Integer> ids = employees.stream().map(emp -> emp.getId()).collect(Collectors.toList());
        System.out.println(ids);

        List<List<String>> cities = employees.stream().map(emp -> emp.getCitiesPreference())
                                                      .collect(Collectors.toList());
        System.out.println(cities);

        List<String> citiesflattened = employees.stream().flatMap(emp->emp.getCitiesPreference().stream())
                                                         .collect(Collectors.toList());
        System.out.println(citiesflattened);

    }
}
