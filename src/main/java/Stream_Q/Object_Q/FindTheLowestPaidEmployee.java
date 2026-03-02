package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheLowestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Optional<Employee> lowestPaid = employees.stream()
                .min(Comparator.comparing(Employee::getSalary));

        lowestPaid.ifPresent(System.out::println);
    }
}
