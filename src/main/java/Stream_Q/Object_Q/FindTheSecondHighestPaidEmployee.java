package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindTheSecondHighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee name = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(name);
    }
}
