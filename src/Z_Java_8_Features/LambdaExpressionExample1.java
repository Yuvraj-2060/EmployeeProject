package Z_Java_8_Features;
interface Operate{
    int addition(int a, int b);
}
interface NumberMax{
    int maxOfTwo(int a, int b);
}
interface StringConcat{
    String concatString(String s1,String s2);
}

public class LambdaExpressionExample1 {
    public static void main(String[] args) {

        Operate operate = (a,b) -> a+b;
        System.out.println(operate.addition(10,20));

        NumberMax numberMax =(a,b)-> a>b ? a:b;
        System.out.println(numberMax.maxOfTwo(10,20));

        StringConcat stringConcat = (s1,s2)-> s1.concat(s2);
        System.out.println("After Concatenation: "+stringConcat.concatString("Yuvraj","Singh"));
    }
}

