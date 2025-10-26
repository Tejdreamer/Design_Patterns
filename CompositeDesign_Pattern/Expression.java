public class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    String operator;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, String operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }


    @Override
    public int evaluate() {
        // Implementation of evaluate method
        int value=0;
        switch(operator) {
            case "+":
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case "-":
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case "*":
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case "/":
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        return value;       
    }
    
}
