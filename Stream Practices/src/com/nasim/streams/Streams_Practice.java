package com.nasim.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String department;
	private Integer salary;
	public Employee(String name, String department, Integer salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public Integer getSalary() {
		return salary;
	}
	
	
}

class DepartmentStats {
    Employee highestPaid;
    double totalSalary;

    public DepartmentStats(Employee highestPaid, double totalSalary) {
        this.highestPaid = highestPaid;
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "[Max = " + highestPaid + ", Total = " + totalSalary + "]";
    }
}


class Transaction{
	
	private String currency;
	private Integer amount;
	
	public Transaction(String currency, Integer amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "Transaction [currency=" + currency + ", amount=" + amount + "]";
	}
	
}

public class Streams_Practice {

	public static void main(String[] args) {
	
//		Q1 : Group Employees by Department & Find Highest Salary in Each (Amazon 2024)
		
		List<Employee> empList=Arrays.asList(
				new Employee("A","HR",50000),
				new Employee("B","HR",60000),
				new Employee("C","IT",70000),
				new Employee("D","IT",90000),
				new Employee("E","SALES",50000));
		
		List<Transaction> txnList=Arrays.asList(
				new Transaction("USD",120),
				new Transaction("USD",220),
				new Transaction("USD",320),
				new Transaction("INR",90),
				new Transaction("INR",190),
				new Transaction("INR",150),
				new Transaction("KD",80),
				new Transaction("KD",70));
		
//		Map<String,Employee> result=empList.stream().
//				collect(Collectors.groupingBy(Employee::getDepartment,
//						Collectors.collectingAndThen(
//								Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
		
//		Map<String,Employee> result=empList.stream().
//				collect(Collectors.toMap(Employee::getDepartment,
//						Function.identity(),
//						BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).getSalary());
//		}
		
//		Q2 : Given a list of employees, group them by department and compute total salary per department.
		
//		Map<String,Double> result=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
//
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key));
//		}
		
//		Q3 : Find the highest-paid employee in each department.
		
		
//		Map<String, Employee> result=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
//						Optional::orElseThrow)));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).toString());
//		}
		
//		Q4 : Group transactions by currency AND compute the total amount per currency.
		
//		Map<String,Double> result=txnList.stream().collect(Collectors.groupingBy(Transaction::getCurrency,
//				Collectors.summingDouble(Transaction::getAmount)));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).toString());
//		}
		
//		Q5 : want the average transaction amount per currency.
		
//		Map<String,Double> result=txnList.stream().collect(Collectors.groupingBy(Transaction::getCurrency,
//				Collectors.averagingDouble(Transaction::getAmount)));
//				
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).toString());
//		}
		
//		Q6 : want the highest transaction per currency.
		
//		Map<String,Transaction> result=txnList.stream().
//				collect(Collectors.groupingBy(Transaction::getCurrency,
//						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Transaction::getAmount)), 
//								Optional::orElseThrow)));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).toString());
//		}
		
//		Q7 : want both COUNT and SUM per currency
		
//			Map<String,DoubleSummaryStatistics> result=txnList.stream()
//					.collect(Collectors.groupingBy(Transaction::getCurrency,
//							Collectors.summarizingDouble(Transaction::getAmount)));
//			
//			for(String key:result.keySet()) {
//				System.out.println(key+" "+result.get(key).toString());
//			}
		
//		Q8 : want to sort currencies by total amount?
		
//		LinkedHashMap<String,Double> result=txnList.stream()
//				.collect(Collectors.groupingBy(Transaction::getCurrency,Collectors.summingDouble(Transaction::getAmount)))
//				.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed())
//		           .collect(Collectors.toMap(
//		                   Map.Entry::getKey,
//		                   Map.Entry::getValue,
//		                   (a, b) -> a,
//		                   LinkedHashMap::new
//		           ));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).toString());
//		}
		
//		Q9 : Find the second highest salary per department
		
//		Map<String, Employee> result = empList.stream()
//			        .collect(Collectors.groupingBy(Employee::getDepartment,
//			            Collectors.collectingAndThen(
//			                Collectors.collectingAndThen(Collectors.toList(),
//			                		list -> list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(new Employee(null,null,null))
//			                ),
//			                e -> e         
//			            )
//			        ));
//		Map<String, Employee> result =
//			    empList.stream()
//			        .collect(Collectors.groupingBy(Employee::getDepartment,
//			            Collectors.collectingAndThen(
//			                Collectors.toList(),
//			                list -> list.stream()
//			                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
//			                        .skip(1)
//			                        .findFirst()
//			                        .orElse(new Employee(null,null,null))
//			            )
//			        ));
//		
//		for(String key:result.keySet()) {
//			System.out.println(key+" "+result.get(key).toString());
//		}
		
//		Q10 : Find the highest-paid employee in each department AND also print the total salary of the department
			
			Map<String, DepartmentStats> result =
		    empList.stream()
		           .collect(Collectors.groupingBy(
		               Employee::getDepartment,
		               Collectors.teeing(
		                   Collectors.maxBy(Comparator.comparing(Employee::getSalary)),   // highest-paid
		                   Collectors.summingDouble(Employee::getSalary),                 // total salary
		                   (maxEmpOpt, totalSal) ->
		                       new DepartmentStats(maxEmpOpt.get(), totalSal)
		               )
		           ));
			for(String key:result.keySet()) {
				System.out.println(key+" "+result.get(key).toString());
			}
		
	}
}