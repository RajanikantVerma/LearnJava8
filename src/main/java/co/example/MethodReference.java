package co.example;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
public class MethodReference {

	public static void main(String[] args) {
		System.out.println("Method reference to static method – Class::staticMethodName");
		List<Integer> abc = Arrays.asList(1,2,3,3,4,4,5,6,8,9,4);
		Optional<Integer> bc = abc.stream().reduce(Math::max);
		bc.ifPresent(value->{System.out.println(value);});
		System.out.println("Reference to constructor – Class::new");
		List<Integer> integers = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));
				Optional<Integer> max = integers.stream().reduce(Math::max); 
				max.ifPresent(System.out::println); 
		System.out.println("Method reference to instance method from instance – ClassInstance::instanceMethodName");
		List<Integer> ab =Arrays.asList(1,2,3,4,6,45,6,677);
		Optional<Integer> maxi = ab.stream().reduce(Math::max);
		maxi.ifPresent(System.out::println);
		System.out.println("Method reference to instance method from class type – Class::instanceMethodName");
		List<String> abcd = Arrays.asList("ram","rrach","rama","chai","tea");
		List<String> sotredone = abcd.stream().sorted((p1,p2)->p1.compareTo(p2)).collect(Collectors.toList());
		System.out.println(sotredone);
	}

}
