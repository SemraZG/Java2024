package interfacee;

public class AudiA4 implements Motor, Klima, Fren{

    //implement ettigimiz tum interfacelerdeki methodlari override etmek(kendimize gore method bodysi eklemek) zorundayiz
    @Override
    public void eco() {
        System.out.println("AudiA4 economikdir");
    }

    @Override
    public void abs() {
        System.out.println("Abs iyidir");
    }

    @Override
    public void esp() {
        System.out.println("Esp daha iyidir");
    }

    @Override
    public void analog() {
        System.out.println("Analog...");
    }

    @Override
    public void digital() {
        System.out.println("Digital...");
    }

    @Override
    public void turbo() {
        System.out.println("Turbooo...");
    }

    @Override
    public void gas() {
        System.out.println("Gas..");
    }
}
