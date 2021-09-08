public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        /*
        * В варианте предложенном в описании задания будет падать с делением на ноль.
        * исправлено в классе Calculator в коде лямбды divide
        */
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
