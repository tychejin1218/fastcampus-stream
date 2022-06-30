import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter4Section2 {

  public static void main(String[] args) {
    /*
    Consumer: 먹보

    @FunctionalInterface
    public interface Consumer<T> {
      void accept(T t);
    }

    Consumer<String> myStringConsumer = (String str) -> {
      System.out.println(str);
    };
    */

    Consumer<String> myStringConsumer = str -> System.out.println(str);
    myStringConsumer.accept("hello");
    myStringConsumer.accept("world");

    List<Integer> integerInputs = Arrays.asList(4, 2, 3);
    Consumer<Integer> myIntegerProcessor = x ->
        System.out.println("Processing integer " + x);
    process(integerInputs, myIntegerProcessor);

    Consumer<Integer> myDifferentIntegerProcessor = x ->
        System.out.println("Processing integer in different way " + x);
    process(integerInputs, myDifferentIntegerProcessor);

    List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
    Consumer<Double> myDoubleProcessor = x ->
        System.out.println("Processing double " + x);
    process(doubleInputs, myDoubleProcessor);
  }

  /*public static void process(List<Integer> inputs, Consumer<Integer> processor) {
    for (Integer input : inputs) {
      processor.accept(input);
    }
  }*/

  public static <T> void process(List<T> inputs, Consumer<T> processor) {
    for (T input : inputs) {
      processor.accept(input);
    }
  }
}
