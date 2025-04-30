package com.learning;

import java.util.Objects;

class Employee {
    private String name;
    private String empId;
    private String depart;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmpId() {
	return empId;
    }

    public void setEmpId(String empId) {
	this.empId = empId;
    }

    public String getDepart() {
	return depart;
    }

    public void setDepart(String depart) {
	this.depart = depart;
    }

    public Employee(String name, String empId, String depart) {
	super();
	this.name = name;
	this.empId = empId;
	this.depart = depart;
    }

    @Override
    public int hashCode() {
	return Objects.hash(depart, empId, name);
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
	return Objects.equals(depart, other.depart) && Objects.equals(empId, other.empId)
		&& Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
	return "Employee [name=" + name + ", empId=" + empId + ", depart=" + depart + "]";
    }

}

public class StreamsSample {

    public static void main(String[] args) {
//	List<Employee> empList = Arrays.asList(new Employee("ganesh", "emp101", "Admin"),
//		new Employee("murugan", "emp102", "HR"), new Employee("parvathy", "emp103", "IT"),
//		new Employee("jesus", "emp104", "IT"), new Employee("brahma", "emp105", "CEO"));
//	Map<String, List<Employee>> collect = empList.stream().filter(emp -> "it".equalsIgnoreCase(emp.getDepart()))
//		.collect(Collectors.groupingBy(Employee::getDepart));
//	System.out.println(collect);
//
//	empList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
//		.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
//	int[] nums = { 3, 5, 7, 9, 4, 5, 6, 8, 11, 13, 987, 2, 3 };
//	List<Integer> listOfNumbersStartWithOne = Arrays.stream(nums).filter(n -> Integer.toString(n).startsWith("1"))
//		.boxed().collect(Collectors.toList());
//	Arrays.stream(nums).filter(n -> !numsSet.add(n)).forEach(System.out::println);
//	Arrays.stream(nums).filter(n -> n % 2 == 0).skip(1).findFirst().ifPresent(System.out::println);

//	empList.stream().min(Comparator.comparing(Employee::getEmpId))
//		.ifPresent(employee -> System.out.println("Employee with max name: " + employee));
//	String input = "hello world happy new year 2026";
//	input.chars().mapToObj(s -> Character.valueOf((char) s))
//		.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//		.filter(e -> e.getValue() == 1).findFirst().ifPresent(System.out::println);
	int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 21 };
//	bubbleSortAsc(numbers);
//	insertionSort(numbers);

	System.out.println(binarySearch(numbers, 10));
//	List<Integer> result = Arrays.stream(numbers).sorted().boxed().collect(Collectors.toList());
//	System.out.println(result);
//	String[] names = { "Ganesha", "Murugan", "Parvathy", "Perumal", "Padmavathi", "Sridevi", "bodevi", "Shivan" };
//	String name = Arrays.stream(names).min((n1, n2) -> Integer.compare(n1.length(), n2.length())).get();
//	System.out.println(name);
    }

    private static void bubbleSortAsc(int[] nums) {
	boolean swap;
	for (int i = 0; i < nums.length - 1; i++) {
	    swap = false;
	    for (int j = 0; j < nums.length - 1 - i; j++) {
		if (nums[j] > nums[j + 1]) {// comparing previous element i to present element
		    int temp = nums[j];
		    nums[j] = nums[j + 1];
		    nums[j + 1] = temp;
		    swap = true;
		}
	    }
	    if (!swap) {
		break;
	    }
	}
    }

    private static void insertionSort(int[] nums) {
	for (int i = 0; i < nums.length - 1; i++) {
	    for (int j = i + 1; j > 0; j--) {
		if (nums[j] < nums[j - 1]) {
		    int temp = nums[j - 1];
		    nums[j - 1] = nums[j];
		    nums[j] = temp;
		} else {
		    break;
		}
	    }
	}
    }

    private static int binarySearch(int[] nums, int target) {
	int start = 0;
	int end = nums.length - 1;
	boolean isAsc = nums[start] < nums[end];

	while (start <= end) {
	    int mid = start + (end - start) / 2;
	    if (target == nums[mid]) {
		return mid;
	    }
	    if (target > nums[mid]) {
		start = mid + 1;
	    } else {
		end = mid - 1;
	    }
	}
	return -1;
    }
}
