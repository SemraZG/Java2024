package ifStatementSwitchTernary;

import java.util.Scanner;

public class Ifstatement02 {
    public static void main(String[] args) {
        //0-4==bebek' 5-12==cocuk, 13-20==genc, 21-30==yetiskin, 30 ustu==tanimlanmamis
        // if-else if-else yapilarinda yukaridan asagiya herhangi biri calistiginda onun asagisindakiler calismaz
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter age");
        int age= input.nextInt();
        if (age<0){
            System.out.println("Please enter a valid age number");
        }else if (age<5){
            System.out.println("Baby");
        }else if (age<13){
            System.out.println("Child");
        }else if (age<21){
            System.out.println("Young");
        }else if (age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Unidetified age");
        }
    }
}
