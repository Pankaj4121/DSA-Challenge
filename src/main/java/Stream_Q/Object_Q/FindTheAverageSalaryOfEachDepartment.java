package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheAverageSalaryOfEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Map<String, Double> avg = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avg);

    }
}
