public class Client {
    public static void main(String[] args) {

        // 5 + 10 * 2
        ArithmeticExpression number1 = new Number1(5);
        ArithmeticExpression number2 = new Number1(10);
        ArithmeticExpression number3 = new Number1(2);

        ArithmeticExpression expression1 = new Expression(number2, number3, "*"); //  10 * 2
        ArithmeticExpression expression2 = new Expression(expression1, number1,"+"); // 5 + (10 * 2)

        int result = expression2.evaluate();
        System.out.println("Result: " + result); // Output: Result: 30
    }
}
