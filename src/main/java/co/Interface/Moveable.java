package co.Interface;
@FunctionalInterface
public interface Moveable {
	void Move();
	default void InMethod() {
		System.out.println( "In Moveable default");
	}
	static void InMthod() {
		System.out.println( "In Moveable Static");
	}
}
