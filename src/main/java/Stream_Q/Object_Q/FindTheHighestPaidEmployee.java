package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheHighestPaidEmployee {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaid.ifPresent(System.out::println);
    }
}

