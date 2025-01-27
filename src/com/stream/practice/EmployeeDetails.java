package com.stream.practice;

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
                new Employee(48000,"Lucy", 48),
                new Employee(28000,"Lucy", 18)
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
        //Get all employees who are older than 25 and earn more than 50,000.
       List<Employee> Ageg25Sm5k= employees.stream()
                .filter(e->e.getAge()>25 && e.getSalary()>50000)
                .collect(Collectors.toList());
       System.out.println("Age is older than 25 and earn more than 50,000:" +Ageg25Sm5k);

        //Create a new list containing the names of the filtered employees, converted to uppercase
           List<String> nameToUpper= filteredresult.stream()
                    .map(e->e.getName().toUpperCase())
                    .collect(Collectors.toList());

           System.out.println("names in uppercase:");
           nameToUpper.forEach(System.out::println);

        //Sort the names of the employees in reverse alphabetical order.
        List<String> sortedNames=employees.stream()
                .map(n->n.getName().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Reverse order sorted:");
        sortedNames.forEach(System.out::println);
        //Ensure there are no duplicate names in the list.
        List<String> list1=employees.stream()
                .map(n->n.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct names:");
        list1.forEach(n->System.out.print(n+" "));
   System.out.println("-----------------------");
        //Limit the list to the first 5 employees after sorting
        List<Employee> limit5=employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("After asec limit 5:");
        System.out.println(limit5);
       // Calculate the total salary of employees whose age is greater than 30.
  double sum= employees.stream()
                .filter(n->n.getAge()>30)
                .mapToDouble(Employee::getSalary)
                .reduce(0,(a,b)->(a+b));
    System.out.println("Sum of the salaries who's age is more than 30:"+sum);
        //Collect the names of employees into a single List<String> and print the list.
             List<String> nameString=employees.stream()
                     .map(Employee::getName)
                     .collect(Collectors.toList());
             System.out.println(nameString);

    }
}
