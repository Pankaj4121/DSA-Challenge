package Stream_Q.Object_Q;

import java.util.*;
import java.util.stream.Collectors;

public class FindheHighestPaidEmployeeInEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Map<String, Employee> groupBySalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Optional::get
                        )
                ));
        System.out.println(groupBySalary);
    }
}
