package co.example;

import java.util.Arrays;

import javax.swing.JButton;

import co.beans.LambdaEmployee;

public class LamdaSort {

	public static void main(String[] args) {
		LambdaEmployee[] Le = {new LambdaEmployee(1,"raj"),
			new LambdaEmployee(2,"Raja"),
			new LambdaEmployee(3,"Ram"),
			new LambdaEmployee(3,"Ram")};
		System.out.println(Arrays.toString(Le));
		Arrays.sort(Le, LambdaEmployee::empComp);
		System.out.println(Arrays.toString(Le));
		
		System.out.println("Adding an event listener to a GUI component");
		JButton button =  new JButton("Submit");
		button.addActionListener((e) -> {
		    System.out.println("Click event triggered !!");
		});

	}

}
