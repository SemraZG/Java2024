package instanceBlock;

public class InstanceBlock03 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

        public String color;
        public String fueltype;

    {//bu classdan her obje uretildiginde burasi calisacak
        color="Siyah";
        fueltype="Benzin";
    }

    //contructor
    public InstanceBlock03(){
        System.out.println("Araba rengi: "+color);
        System.out.println("Araba yakit turu: "+fueltype);
    }

    //parametreki constructor--default olarak siyah be bnezinli baslatmak istemezsek bunu kullanacagiz

    public InstanceBlock03(String color, String fueltype) {
        this.color = color;
        this.fueltype = fueltype;
    }
}
