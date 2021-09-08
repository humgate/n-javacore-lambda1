import java.util.function.*;

public class Calculator {
    /*
     * Ссылка на метод — это, если очень грубо, реализация функционального интерфейса,
     * описанная другой функцией.
     * В примере ниже метод get() функционального интерфейса Supplier реализован методом другого объекта
     * - а именно конструктором класса Calculator
     *
     * static Supplier<Calculator> instance = () -> new Calculator();
     *
     * и затем это выражение заменено на формат method reference
     */
    static Supplier<Calculator> instance = Calculator::new;

    /*
    * В классе Integer есть метод sum, который может реализовать метод apply функционального интерфейса
    * BinaryOperator, поэтому запись
    *     BinaryOperator<Integer> plus = (x, y) -> x + y;
    * можно заменить на method reference:
    */
    BinaryOperator<Integer> plus = Integer::sum;

    BinaryOperator<Integer> minus = (x, y) -> x - y;

    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //если делитель равен 0, то возвращаем 0 иначе будет падать с эксепшоном деления на ноль
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    /*
    * метод accept функционального интерфейса Consumer реализуется методом println от System.out
    * поэтому такую запись лямбда выражения
    * Consumer<Integer> println = x -> System.out.println(x);
    * можно заменить на такую:
    */

    Consumer<Integer> println = System.out::println;
}
