package constructor;

public class CarRunner {
    public static void main(String[] args) {
        //4- car class'indan bir object uretelim
        Car car =new Car("BMW", "3.2",2023, false);// //8- constructor icine arguman girelim
        System.out.println("car.brand = " + car.brand);
        System.out.println("car.model = " + car.model);
        System.out.println("car.year = " + car.year);
        System.out.println("car.hybrid = " + car.hybrid);
        car.act();
        car.stop();

        //5- Car class'a donup custom constructor olusturalim

        //12-Runnera gidip yeni cunstructor ile obje uretelim
        Car car2=new Car("Fiat", "Sahin");
        System.out.println(car2);
    }
}
