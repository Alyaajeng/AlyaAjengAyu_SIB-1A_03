public class ContohVariabel03 {

    public static void main(String[] args) {
        String salahSatuHobbySayaAdalah = "Berenang";
        boolean isBeautyandSmart = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 19;
        double $ipk = 3.98, tinggi = 1.57;
        System.out.println("Hobby saya apa? " +salahSatuHobbySayaAdalah);
        System.out.println("Apakah cantik dan cerdas? " +isBeautyandSmart);
        System.out.println("Jenis kelamin: " +jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %f, dengan tinggi badannya %f", $ipk, tinggi));
    }
}