public class Number1 implements ArithmeticExpression {
    
    int value;

    public Number1(int value) {
        this.value = value;
    }

    public int evaluate() {
        return this.value;
    }
}
