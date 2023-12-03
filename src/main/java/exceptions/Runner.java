package exceptions;

public class Runner {
    public static void main(String[] args) {
        ogrenciNotu(55);
        ogrenciNotu(-55);
    }

    public static void ogrenciNotu(int not){
        if (not<0||not>100){
            try {
                throw new KendiOlusturdugumuzExceptions("Ogrenci notu 0'dan kucuk ve 100'den buyuk olamaz.");
            } catch (KendiOlusturdugumuzExceptions e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(not);
        }
    }


}
