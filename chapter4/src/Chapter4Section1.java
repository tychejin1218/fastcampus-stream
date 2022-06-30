import java.util.function.Supplier;

public class Chapter4Section1 {

  public static void main(String[] args) {
		/*
		Supplier: 아낌없이 주는 나무

		@FunctionalInterface
		public interface Supplier<T> {
			T get();
		}

		Supplier<String> myStringSupplier = () -> {
			return "hello world!";
		};
    */

    Supplier<String> myStringSupplier = () -> "hello world!";
    System.out.println(myStringSupplier.get());

    Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
    /*System.out.println(myRandomDoubleSupplier.get());
    System.out.println(myRandomDoubleSupplier.get());
    System.out.println(myRandomDoubleSupplier.get());*/
    printRandomDoubles(myRandomDoubleSupplier, 5);
  }

  public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(randomSupplier.get());
    }
  }
}