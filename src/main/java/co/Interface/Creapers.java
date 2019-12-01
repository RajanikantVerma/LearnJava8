package co.Interface;
@FunctionalInterface
public interface Creapers {
	void creap();
	default void InMethod() {
		System.out.println("In Creapers default");
	}
	static void InMthod() {
		System.out.println("In Creapers Static");
	}

}
