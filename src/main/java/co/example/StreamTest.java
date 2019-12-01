package co.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1,2,3,4,5,6,7,8,9);
		s.forEach(p->System.out.println(p));
		System.out.println("Stream.of(arrayOfElements)");
		Stream<Integer> s1 =Stream.of(new Integer[] {1,2,3,4,5,6});
		s1.forEachOrdered(p1->System.out.println(p1*p1));
		System.out.println("List.stream()");
		List<String> s2= new ArrayList<String>();
		s2.add("Ram");
		s2.add("Shyam");
		s2.add("Rahim");
		Stream<String> s12= s2.stream();
		s12.forEach(p2->System.out.println("ab : "+p2));
		System.out.println("Stream.generate() or Stream.iterate()");
		Stream<Date> date = Stream.generate(()->{ return new Date();}).limit(5);
		date.forEach(p->{System.out.println(p);});
		System.out.println("String chars or String tokens");
		IntStream  str ="123456_abcdef".chars();
		str.forEach(p->System.out.println(p));
		System.out.println("OR");
		Stream<String> stream = Stream.of("A$B$C".split("\\$"));
        stream.forEach(p -> System.out.println(p));
        System.out.println("Convert Stream to List – Stream.collect( Collectors.toList() )");
        List<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<10;i++) {
        	list.add(i);
        }
        Stream<Integer> s5 =list.stream();
        List<Integer> l=s5.filter(i->i%2==0).collect(Collectors.toList());
        l.forEach(p->System.out.println(p));
        System.out.println("Convert Stream to array – Stream.toArray( EntryType[]::new )");
        Integer[] a= list.stream().filter(i->i%3==0).toArray(Integer[]::new);
        System.out.println(a);
        System.out.println("Intermediate operations Stream.filter()");
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        
        memberNames.stream().filter(p->p.startsWith("A")).forEach(System.out::println); 
        
        System.out.println("Stream.map()");
        memberNames.stream().filter(p->p.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("Stream.sorted()");
        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("Stream.forEach()");
        memberNames.forEach(System.out::println);
        System.out.println("Stream.collect()");
        List<String> members = memberNames.stream().sorted().collect(Collectors.toList());
        List<String> member1 = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("members : "+members);
        System.out.println("member1 : "+member1);
        System.out.println("Stream.match()");
        
        
        
		
	}
}
