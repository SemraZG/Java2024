package exceptions;

public class Exceptions07 {
    public static void main(String[] args) {
        //6) IllegalArgumentException,bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
        printAge(25);//25
        printAge(-3);//-3---negatifi de yazdiriyor burda hatayi biz uretip firlatacgiz, firlattiktan sonra yzdirmadi

    }//main disi


    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Yasi negatif girmeyiniz.");
            //exception i atip biraktik, bu haliyle program durur calismaya devam etmez.
        }else{
            System.out.println(age);
        }

    }
}
