package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        List<Employee> salar = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                        .collect(Collectors.toList());

        System.out.println(salar);
    }
}
