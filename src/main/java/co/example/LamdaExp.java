package co.example;
import java.util.List;
import java.util.ArrayList;

public class LamdaExp {

	public static void main(String[] args) {
		System.out.println("Java 8 functional interface\r\n");
		new Thread(()->{
			System.out.println("in lamda thread");
		}).start();
		System.out.println("Iterating over a List and perform some operations");
		List<Integer> ab = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			ab.add(i);
		}
		ab.forEach(p->{System.out.println(p);});
	}

}
