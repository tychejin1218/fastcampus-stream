import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Chapter4Section3 {

  public static void main(String[] args) {
		/*
		BiConsumer: 더 먹보

		@FunctionalInterface
		public interface BiConsumer<T, U> {
			void accept(T t, U u);
		}
		*/

    List<Double> inputs = Arrays.asList(1.1, 2.2, 3.3);
    BiConsumer<Integer, Double> myDoubleProcessor = (index, input) ->
        System.out.println("Processing " + input + " at index " + index);
    process(inputs, myDoubleProcessor);
  }

  public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
    for (int i = 0; i < inputs.size(); i++) {
      processor.accept(i, inputs.get(i));
    }
  }
}
