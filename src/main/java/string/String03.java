package string;

public class String03 {
    public static void main(String[] args) {
        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789
        String cardNum = "1234 6789 1234 6789";
        String first=cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);
        String last=cardNum.substring(15);
        String result=first.concat(last);
        System.out.println(result);//**** **** **** 6789



    }
}
