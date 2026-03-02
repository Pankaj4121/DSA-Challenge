package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesBasedOnSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Map<Boolean, List<Employee>> partitionBy = employees.stream()
                .collect(Collectors.partitioningBy( x -> x.getSalary() > 50000));
        System.out.println(partitionBy);
    }
}
