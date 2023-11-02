package variablesWrapperConcatenationTypeCasting;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a=5;
        a +=2; //a=7
        a -=4; //a=3
        a *=2; //a=6
        a /=6; //a=1
        a +=1; // == a==;
        a++;
        System.out.println(a);//3
        a--;
        System.out.println(a);//2

        int b=10;
        int c=b++;
        System.out.println(b);//11
        System.out.println(c);//10

        int d=11;
        int e=++d;
        System.out.println(d);//12
        System.out.println(e);//12
    }
}
