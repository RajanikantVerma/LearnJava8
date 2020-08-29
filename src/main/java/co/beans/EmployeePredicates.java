package co.beans;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class EmployeePredicates {
	
	public static Predicate<Employee> isAdultMale(){
		return p-> p.getAge() >21 && p.getGender().equalsIgnoreCase("M");
	}
	public static Predicate<Employee> isAdultFeMale(){
		return p-> p.getAge() >18 && p.getGender().equalsIgnoreCase("F");
	}
	public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
     
    public static List<Employee> filterEmployees (List<Employee> employees, 
                                                Predicate<Employee> predicate) 
    {
        return employees.stream()
                    .filter( predicate )
                    .collect(Collectors.<Employee>toList());
    }
    public void rajni() {
    	System.out.println("rajni");
    }
}
