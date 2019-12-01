package co.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachTest {

	public static void main(String[] args) {
		List<Integer> ab = new ArrayList<Integer>(Arrays.asList(1,3,5,6,7,8,8,9));
		Consumer<Integer> action = System.out::println;
		ab.stream().filter(i->i%2==0).forEach(action);
		System.out.println("Whole List");
		ab.stream().forEach(action);
		System.out.println("Map key vaue");
		Map<Integer,String> bc = new HashMap<Integer,String>();
		bc.put(1, "abcd");
		bc.put(2,"Lol");
		bc.put(3, "Raj");
		bc.put(4, "efgh");
		bc.put(5, "Rajani");
		Consumer<Map.Entry<Integer, String>> action1 = System.out::println;
		bc.entrySet().forEach(action1);
		System.out.println("Map Key");
		Consumer<Integer> action2 = System.out::println;
		bc.keySet().forEach(action2);
		System.out.println("Map Value");
		Consumer<String> action3 = System.out::println;
		bc.values().forEach(action3);
		System.out.println("Custom action");
		Consumer<Map.Entry<Integer, String>>  action4 =entry ->{
			System.out.println("Map Key : " +entry.getKey());
			System.out.println("Map Value : " +entry.getValue());
		};
		bc.entrySet().forEach(action4);
	}

}
