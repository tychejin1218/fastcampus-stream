import java.util.function.BiFunction;

public class Chapter3Section3 {

  public static void main(String[] args) {

		/*
		BiFunction Interface: 매개변수가 두 개일 때

		BiFunction<Integer, Integer, Integer> add = (Integer x, Integer y) -> {
			return x + y;
		}
		*/
    BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    int result = add.apply(3, 5);
    System.out.println(result);
  }
}
