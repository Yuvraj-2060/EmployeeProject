package Z_Java_8_Features.Lambda_Expression;

interface NumberOperation {
    int operate(int a, int b);
}

public class EnhancedCalculator {
    static int doOperate(int a, int b, NumberOperation op){
        return op.operate(a, b);
    }
    public static void main(String[] args) {
        // For Addition
        var addTwo = doOperate(20, 10, (a, b) -> a + b);
        System.out.println("Addition: " + addTwo);

        // For Subtraction
        var subtractTwo = doOperate(20, 10, (a, b) -> a - b);
        System.out.println("Subtraction: " + subtractTwo);

        // For Multiplication
        var multiplyTwo = doOperate(20, 10, (a, b) -> a * b);
        System.out.println("Multiplication: " + multiplyTwo);

        // For Division
        var divideTwo = doOperate(20, 0, (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Cannot divide by zero!");
            }
        });
    }
}
