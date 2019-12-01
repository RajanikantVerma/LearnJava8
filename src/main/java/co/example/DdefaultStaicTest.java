package co.example;

import co.Interface.Creapers;
import co.Interface.Moveable;
import co.Interface.NoSame;
import co.Interface.Walkable;

public class DdefaultStaicTest implements Creapers, Walkable, Moveable, NoSame {

	@Override
	public void Move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void creap() {
		// TODO Auto-generated method stub

	}

	@Override
	public void InMethod() {
		// TODO Auto-generated method stub
		System.out.println("In test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DdefaultStaicTest ab = new DdefaultStaicTest();
		ab.InMethod();
		Creapers.InMthod();
		Walkable.InMthod();
		Moveable.InMthod();
		NoSame.InMethod11();
		ab.NoSame1();
		ab.creap();
		ab.Move();
		ab.Walk();
	}

	@Override
	public void NoSame1() {
		// TODO Auto-generated method stub
		
	}

}
