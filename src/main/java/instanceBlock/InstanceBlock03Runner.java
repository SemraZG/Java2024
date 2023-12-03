package instanceBlock;

public class InstanceBlock03Runner {
    public static void main(String[] args) {
        InstanceBlock03 car1=new InstanceBlock03();//paramtresiz contructorli olani kullandim
        //sout demeden asagiyi yazdirdi
        // Araba rengi: Siyah
        //Araba yakit turu: Benzin
        InstanceBlock03 car2=new InstanceBlock03("Kirmizi", "Dizel");//paramtreli olani kiullandim
        //sout yazdirmazsam konsolda cikmaz cunku burda custom olani kullanmadik
        System.out.println("Araba rengi:" +car2.color);
        System.out.println("Araba yakit turu:" +car2.fueltype);
    }
}
