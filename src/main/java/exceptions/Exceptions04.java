package exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
        //4) ArrayIndexOutOfBoundsException:
        // Bir dizi elemanına erişilmeye çalışıldığında, dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.
        String[] arr={"j","a","v","a"};
        getElementFromArray(arr, 2);//v
        getElementFromArray(arr, 4);//index numarasi: 3'den buyuk olamaz.

    }//main disi
    public static void getElementFromArray(String[] s, int idx){
        try {
            String element=s[idx];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index numarasi: "+(s.length-1)+"'den buyuk olamaz.");
        }
    }
}
