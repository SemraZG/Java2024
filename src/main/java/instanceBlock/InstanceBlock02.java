package instanceBlock;

public class InstanceBlock02 {
    /*Eger tum constructor'larin icinde calismasi gereken ayni kodlar varsa,
    tekrardan kurtulmak icin bu kodlari instance block icine yazariz*/

    public int year;

    {
        System.out.println("Herkese Selam");
    }

    //2 tane constructor olusturalim


    public InstanceBlock02() {
        //burdki kodu instance block icine tasidik
    }

    public InstanceBlock02(int year) {
        //burdki kodu instance block icine tasidik
        this.year = year;
    }


}
