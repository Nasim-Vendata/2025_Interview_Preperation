package com.nasim.streams.infor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	
	private String name;
	private Integer id;
	private Integer salary;
	private String department;
	
	public Employee(String name, Integer id, Integer salary,String department) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.department=department;
	}
	
	
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public Integer getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", department="+department+"]";
	}
	
	
}


public class Practice {
	
	
	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(
				new Employee("Nasim",100,3000,"DM"),
				new Employee("Namrata",101,8000,"DM"),
				new Employee("Ritika",102,5000,"DM"),
				new Employee("Ritika",102,5000,"DM"),
				new Employee("Ritika",102,35000,"DI"),
				new Employee("Ritika",102,25000,"DI"),
				new Employee("Ritika",102,15000,"DI"),
				new Employee("Namrista",103,6000,"DM"));
		
//		Q1: Second Highest Salary
		
//		Employee result=empList.stream()
//				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
//		
//		System.out.println(result);
		
		
//		Q2: Count the number of occurrences of each word in a List<String>
		
//		List<String> stringList=Arrays.asList("Nasim","Kolkata","Hyderabad","Nasim");
//		
//		Map<String,Integer> result= stringList.stream().collect(Collectors.toMap(str->str, str->1,Integer::sum));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
		
//		Q3: Group employees by department and find the highest-paid employee in each department.
		
//		Map<String,Employee> result=empList.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment,
//						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
		
//		Q4: Given List<List<Integer>>, flatten it into a single list.
		
//		List<List<Integer>> dataList=Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(2,3,4,5));
//		
//		List<Integer> result=dataList.stream().flatMap(list->list.stream().distinct()).toList();
//		
//		System.out.println(result);
		
		
//		Q5:From a list of employees, get the names of employees whose salary > 5000 and sort alphabetically.
		
//		List<String> result=empList.stream().filter(emp->emp.getSalary()>=5000).map(Employee::getName).sorted().toList();
//		
//		System.out.println(result);
		
		
//		Q6: Find the total salary of all employees.
		
//		Double result=empList.stream().collect(Collectors.summingDouble(Employee::getSalary));
//		
//		System.out.println(result);
		
//		Q7: Partition employees into two groups: salary > 5000 and ≤ 5000.
		
//		Map<Boolean,List<Employee>> result=empList.stream().collect(Collectors.partitioningBy(emp->emp.getSalary()>=5000));
//		
//		System.out.println(result.get(true));
//		
//		System.out.println(result.get(false));
		
//		Q8: Calculate average salary per department.
		
//		Map<String,Double> result=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.averagingDouble(Employee::getSalary)));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
//		Q9: Find all duplicate integers in a list.
		
		
//		List<Integer> dataList=Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 5);
//		
//		Set<Integer> result=dataList.stream().filter(data->Collections.frequency(dataList, data)>1).collect(Collectors.toSet());
//		
//		System.out.println(result);
//		
//		Q10: Find the longest string in a list.
		
//		List<String> stringList=Arrays.asList("Nasim","Kolkata","Hyderabad","Nasim");
//		
//		String result1 = stringList.stream().max(Comparator.comparing(String::length)).get();
//		
//		Optional<String> result2 = stringList.stream().collect(Collectors.maxBy(Comparator.comparing(String::length)));
//		
//		
//		System.out.println(result1);
//		System.out.println(result2.get());
		
//		Q11: Sort employees by department, then by salary descending.
		
//		List<Employee> sortedList=empList.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary).reversed()).toList();
//		
//		System.out.println(empList);
//		System.out.println("After Sorting");
//		System.out.println(sortedList);
		
		
//		Q12: Find top 3 highest salaries in a list.
		
//		List<Employee> result=empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
//		
//		System.out.println(result);
		
//		Q13: Convert a list of employees to Map<Id, Employee> safely handling duplicate keys.
		
//		Map<Integer,Employee> result=empList.stream().collect(Collectors.toMap(Employee::getId,e->e,(oldvalue,newvalue)->newvalue));
//		
//		for(Integer key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
//		Q14: Count the number of employees in each department.
		
//		Map<String,Integer> result=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.collectingAndThen(Collectors.counting(),Long::intValue )));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
		
//		Q15 : Given List<List<String>>, get all strings starting with "A".
		
//		List<List<String>> dataList=Arrays.asList(Arrays.asList("Nasim","Kolkata","America"),Arrays.asList("Africa","Argentina"));
//		
//		List<String> result=dataList.stream().flatMap(data->data.stream().filter(str->str.startsWith("A"))).toList();
//		
//		System.out.println(result);
		
		
//		Q16 : Find the employee with max salary, and provide a default if list is empty.
		
		
//			Employee result=empList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(new Employee(null,null,null,null));
//			
//			System.out.println(result);
		
		
//		Q17 : From a list of numbers, find sum of even numbers using IntStream.
		
//			List<Integer> dataList=Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 5);
//			
//			Integer result=dataList.stream().filter(n->n%2==0).collect(Collectors.summingInt(Integer::intValue));
//			
//			System.out.println(result);
		
//		Q18: Check if all employees have salary > 3000.
		
//		List<Employee> result=empList.stream().filter(emp->emp.getSalary()<=3000).toList();
//		
//		System.out.println(result);
		
//		Q19: Concatenate all employee names separated by commas.
		
//		String result=empList.stream().map(Employee::getName).collect(Collectors.joining(","));
//		
//		System.out.println(result);
				
//		Q20:Find top 2 highest salaries per department.
		
//		Map<String, List<Employee>> result = empList.stream()
//		        .collect(Collectors.groupingBy(Employee::getDepartment,
//		                Collectors.collectingAndThen(Collectors.toList(),
//		                        list -> list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList()))
//		        ));
//		
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
		
//		Q21 : From a list of integers, remove duplicates and sort.
		
		
//		List<Integer> dataList=Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 5);
//		
//		List<Integer> result=dataList.stream().sorted().distinct().toList();
//		
//		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
  