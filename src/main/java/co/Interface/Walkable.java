package co.Interface;
@FunctionalInterface
public interface Walkable {
	void Walk();
	default void InMethod() {
		System.out.println("In Walkable default");
	}
	static void InMthod() {
		System.out.println("In Walkable Static");
	}

}
