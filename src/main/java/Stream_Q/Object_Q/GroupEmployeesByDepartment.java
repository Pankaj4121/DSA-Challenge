package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(grouped);
    }
}
