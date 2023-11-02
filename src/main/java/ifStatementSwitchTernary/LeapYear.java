package ifStatementSwitchTernary;

public class LeapYear {
    public static void main(String[] args) {

        //Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz. interview sorusu
        // 1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap  1800==>Leap degil
        // 2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap  2005==>Leap degil
        int year=2004;
        String result= (year%100==0) ? ((year%400==0) ? "LeapYear" : "NotLeap") : ((year%4==0) ? "LeapYear" : "NotLeap");
        System.out.println(result);
    }
}
