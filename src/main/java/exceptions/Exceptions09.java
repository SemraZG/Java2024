package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyPair;

public class Exceptions09 {
    public static void main(String[] args) {
        //Not: Bir onceki uygulamamizda method signature icine exception eklemesi yaptik.
        // Bu seferde try-catch kullanalim
        try{
            FileInputStream fis=new FileInputStream("src/main/java/exceptions/file.txt");
            int k =0;
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

         /*
        1) FileNotFoundException ve IOException Compile Time Exception'lardir. Yani kodu yazarken hata aliriz.
        2) IOException Class, FileNotFoundException class'in parent'idir yani
            istenirse FileNotFoundException yerine IOException'da kullanilabilir
        3) IOException ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
         */
        int a=12;
        int b=4;
        int[] c={3,5,7,9};
        getir(c,a,b);

    }//main disi
    public static void getir(int[] c, int a, int b){
        try{
            int idx=a/b;
            int element=c[idx];
            System.out.println(element);
        }catch (ArithmeticException e){
        System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Database ile baglantiyi kesiniz");
        }
        }
}
