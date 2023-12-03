package exceptions;

public class Exceptions11 {
    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9};
        getir(c, a, b);
    } //main disi

    public static void getir(int[] c, int a, int b) {
        try {

            int idx = a / b;
            int element = c[idx];
            System.out.println(element);

        } finally {
            System.out.println("Veritabani baglantisi kesilmelidir");
        }
        System.out.println("Baglantiyi kesin"); //burasi calismaz finally den sonra oldugu icin, catch olsaydi catch den sonra calisirdi

    }
}
