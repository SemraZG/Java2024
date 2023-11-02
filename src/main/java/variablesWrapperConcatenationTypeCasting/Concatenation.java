package variablesWrapperConcatenationTypeCasting;

public class Concatenation {
    public static void main(String[] args) {

        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b); //elma1011
        System.out.println(s + (a + b)); //elma21
        System.out.println(s + a * b); //elma110
        System.out.println(a + b + s); //21elma
    }
}
