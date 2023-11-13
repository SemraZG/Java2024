package methodCreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.

        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir ve
        bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde geçerli
        ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz.

        Java da metot main metodun disinda olusturulur.

        Access modifier + Static (optional) + return type + method ismi + () + {}

        Olusturulan method main method icinden cagirilir. Buna "Method Call" denir
        */
        int sonuc = toplama(5, 3);
        System.out.println("sonuc = " + sonuc); //sonuc = 8

    } //Main method sonu

        //Ornek 1: Toplama islemi yapan bir method olusturunuz

    public static int toplama(int a, int b){
        return a + b;
    }
}
