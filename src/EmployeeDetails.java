import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{


    private int age;
    private String name;
    private int salary;
    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name=" + name +
                ", salary=" + salary +
                '}';
    }
}



public class EmployeeDetails {
    public static void main(String[] args){

        List<Employee> employees= Arrays.asList(
                new Employee(55000,"John", 32),
                new Employee(75000,"Jane", 45),
                new Employee(50000,"Jake", 40),
                new Employee(60000,"Sarah", 30),
                new Employee(90000,"Tom", 39),
                new Employee(48000,"Lucy", 48)
        );

        System.out.println(employees);


        //Get all employees who are aged between 40 and 50 (inclusive).
        List<Employee> filteredresult=employees.stream()
                .filter(e -> e.getAge() >= 40 && e.getAge() <= 50)
                .collect(Collectors.toList());

      filteredresult.forEach(System.out::println);
        System.out.println("filter the employees based on the age:"+filteredresult);

        //Map: For each of the filtered employees, create a new object containing their name and salary.


        List<String> nameAndAge=filteredresult.stream()
                .map(e->e.getName()+" "+e.getSalary())
                .collect(Collectors.toList());

        System.out.println("employees name and age:" +nameAndAge);

        //Sort: Sort the employees by their salary in descending order.
        List<Integer> salary=employees.stream()
                .map(n->n.getSalary())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("employees salary by desc:" +salary);
        /*Group: Group the employees into two categories based on their salary:
        those who earn more than $50,000
        and those who earn $50,000 or less.*/

        Map<String, List<Employee>> groupedBySalary=employees.stream()
                .collect(Collectors.groupingBy
                        (e->e.getSalary()>50000? "more than 50000":"less than50k"));

        groupedBySalary.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach(System.out::println);
        });
        /*Calculate Average Salary: Calculate and print the average
         salary of employees who are older than 40.
*/

        double average=employees.stream()
                .filter(n->n.getAge()>40)
                .collect(Collectors.averagingInt(Employee::getAge));
        System.out.println("age is more than 40 avg:" +average);
    }
}
