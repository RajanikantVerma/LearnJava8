package co.Interface;
@FunctionalInterface
public interface NoSame {
	void NoSame1();
	default void InMethod1() {
		System.out.println("In NoSame default");
	}
	static void InMethod11() {
		System.out.println("In NoSame Static");
	}
	@Override
    public abstract String toString();

}
