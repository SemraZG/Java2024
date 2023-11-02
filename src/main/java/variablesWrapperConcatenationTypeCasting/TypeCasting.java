package variablesWrapperConcatenationTypeCasting;

public class TypeCasting {
    /**
     * AutoWidening-->kucuk data tiplerinin kucuk datd tiplerine donusturulmesidir Java otomatik yapar.
     * Explicit Narrowing-->Buyuk datd tiplerinin kucuk data tiplerine cevrilmesidir, kod yazanlar yapar, java otomtk yapmaz
       Explicit Narrowing veri kaybina yol acabilir
     */

    public static void main(String[] args) {
        byte age=13;
        int ageInt=age;

        int heigh=313;
        short heighShort=(short) heigh;//daha buyuk olan data tipindeki datayi kucuk olan data tipine manuel olrk degistrdk.

    }
}
