package Stream_Q.Object_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetOnlyEmployeeNamesFromTheList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        List<String> onlyName = employees.stream()
                .map(Employee::getName)
                .toList();

        System.out.println(onlyName);
    }
}
