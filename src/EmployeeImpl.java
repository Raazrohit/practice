import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmployeeImpl{
    public static void main(String[] args) {
        List<Employee>employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"vaibhav","Indore"));
        employeeList.add(new Employee(105,"Divan","Lucknow"));
        employeeList.add(new Employee(103,"Charu","Delhi"));
        employeeList.add(new Employee(107,"Kamlesh","Gujrat"));
        employeeList.add(new Employee(100,"Binod","Noida"));
        System.out.println("employeeList = " + employeeList);

        TreeSet<Employee> List = new TreeSet<Employee>();
        for (Employee element : employeeList){
            List.add(element);
        }
        System.out.println("List = " + List);

        TreeSet<Employee> newList = new TreeSet<Employee>();
        newList.addAll(employeeList);
    }

}
