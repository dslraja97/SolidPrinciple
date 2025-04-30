package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class PractiseStream {

    public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(new Employee("E001", "Alice", 70000, "HR", 25),
		new Employee("E002", "Bob", 85000, "IT", 32), new Employee("E003", "Charlie", 78000, "Finance", 29),
		new Employee("E004", "David", 92000, "IT", 38), new Employee("E005", "Eve", 69000, "HR", 26),
		new Employee("E006", "Frank", 110000, "Finance", 41),
		new Employee("E007", "Grace", 60000, "Marketing", 27));

	List<Employee> collect = employees.stream()
		.sorted(Comparator.comparingInt(Employee::getEmp_salary)
			.thenComparing(Comparator.comparing(Employee::getEmp_dept)
				.thenComparing(Comparator.comparing(Employee::getEmp_id)
					.thenComparing(Comparator.comparingInt(Employee::getEmp_age)))))
		.collect(Collectors.toList());
	// Map<String, Double> collect3 = employees.stream().collect(
//		Collectors.groupingBy(Employee::getEmp_dept, Collectors.averagingDouble(Employee::getEmp_salary)));
//	System.out.println("Employee Average Based on Each Department!");
//	collect3.entrySet().stream().forEach(System.out::println);
	collect.stream().forEach(System.out::println);

//	Map<String, Integer> collect4 = employees.stream()
//		.collect(Collectors.groupingBy(Employee::getEmp_dept,
//			Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getEmp_salary)),
//				emp -> emp.map(e -> e.getEmp_salary()).orElse(0))));
//	System.out.println("Max Salary Based on Each Department!");
//	collect4.entrySet().forEach(System.out::println);
//
//	Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getEmp_dept));
//	System.out.println("Grouped Employe Based on Department!!");
//	collect.entrySet().stream().forEach(System.out::println);
//
//	List<Employee> collect2 = employees.stream().sorted(Comparator.comparingInt(Employee::getEmp_salary))
//		.collect(Collectors.toList());
//	System.out.println("Sort based on the Salary in ASC Order");
//	collect2.stream().forEach(System.out::println);
    }

    private static void maxSalaryOnEachDepartment(List<Employee> employees) {
	Map<String, Integer> collect = employees.stream()
		.collect(Collectors.groupingBy(Employee::getEmp_dept,
			Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getEmp_salary)),
				emp -> emp.map(e -> e.getEmp_salary()).orElse(0))));

	System.out.println(collect);
    }

    private static void groupingBasedOnDepWiseSalary(List<Employee> employees) {
	Map<String, Double> collect = employees.stream().collect(
		Collectors.groupingBy(Employee::getEmp_dept, Collectors.averagingLong(Employee::getEmp_salary)));
	collect.entrySet().stream().forEach(System.out::println);
    }

    private static void employeeDataBasedOnAge(List<Employee> employees) {
	Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(emp -> {
	    int age = emp.getEmp_age();
	    if (age >= 21 && age <= 30)
		return "20-30";
	    else if (age >= 31 && age <= 40)
		return "31-40";
	    else
		return "others";
	}));

	collect.entrySet().stream().forEach(System.out::println);
    }

}

class Employee {
    private String emp_id;
    private String emp_name;
    private int emp_salary;
    private String emp_dept;
    private int emp_age;

    public String getEmp_id() {
	return emp_id;
    }

    public void setEmp_id(String emp_id) {
	this.emp_id = emp_id;
    }

    public String getEmp_name() {
	return emp_name;
    }

    public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
    }

    public int getEmp_salary() {
	return emp_salary;
    }

    public void setEmp_salary(int emp_salary) {
	this.emp_salary = emp_salary;
    }

    public String getEmp_dept() {
	return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
	this.emp_dept = emp_dept;
    }

    public int getEmp_age() {
	return emp_age;
    }

    public void setEmp_age(int emp_age) {
	this.emp_age = emp_age;
    }

    public Employee(String emp_id, String emp_name, int emp_salary, String emp_dept, int emp_age) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_salary = emp_salary;
	this.emp_dept = emp_dept;
	this.emp_age = emp_age;
    }

    @Override
    public int hashCode() {
	return Objects.hash(emp_age, emp_dept, emp_id, emp_name, emp_salary);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	return emp_age == other.emp_age && Objects.equals(emp_dept, other.emp_dept)
		&& Objects.equals(emp_id, other.emp_id) && Objects.equals(emp_name, other.emp_name)
		&& emp_salary == other.emp_salary;
    }

    @Override
    public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_dept="
		+ emp_dept + ", emp_age=" + emp_age + "]";
    }

}
