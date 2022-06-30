import java.util.function.Function;

public class Chapter3Section2 {

  public static void main(String[] args) {
    /*
		함수의 구성요소
		 - 함수의 이름
		 - 반환값의 타입 (return type)
		 - 매개변수 (parameters)
		 - 함수의 내용 (body)
		*/

		/*
		Lambda Expression: 이름이 없는 함수(Anonymous function)

		(Integer x) -> {
			return x + 10;
		}

		Function<Integer, Integer> myAdder = (Integer x) ->{
			 return x + 10;
		};
	  */

		/*
		Lambda Expression: 심지어 더 단순한게
		 - 매개변수의 타입이 유추 가능할 경우 타입 생략 가능
		 - 매개변수가 하나일 경우 괄호 생략 가능
		 - 바로 리턴하는 경우 중괄호 생략 가능
    */

    Function<Integer, Integer> myAdder = x -> x + 10;
    int result = myAdder.apply(5);
    System.out.println(result);
  }
}
