package interfacee;

public class AudiA4Runner {
    public static void main(String[] args) {

       // Motor m=new Motor();--->interfacelerden object uretemeyiz cunku interfaceler soyuttur.
        AudiA4 a4=new AudiA4();
        a4.turbo();//Turbooo...
        a4.analog();//Analog...
        a4.esp();//Esp daha iyidir

    }
}
