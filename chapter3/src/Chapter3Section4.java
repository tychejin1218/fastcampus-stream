import util.TriFunction;

public class Chapter3Section4 {

  public static void main(String[] args) {
    /*
     Functional Interface: 함수의 뼈대
      - 단 하나의 abstract method만을 가지는 인터페이스(Single Abstract Method interface)
      - Default method와 static method는 이미 구현이 되어있으므로 있어도 괜찮음
      - java.lang.Runnable, java.util.Comparator, java.util.concurrent.Callable, etc

    TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers =
        (Integer x, Integer y, Integer z) -> {
          return x + y + z;
        };
    */

    TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers =
        (x, y, z) -> x + y + z;
    int result = addThreeNumbers.apply(3, 2, 5);
    System.out.println(result);
  }

  /*
  Chapter3 Summary

  Functional Interface
   - 단 하나의 abstract method를 가진 interface
   - Function Interface
   - BiFunction Interface
   - 나만의 Functional Interface
  Lambda Expression
   - 함수형 인터페이스를 구현하는 가장 간단한 방법
  */
}