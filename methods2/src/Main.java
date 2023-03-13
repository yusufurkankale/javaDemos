public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,6);
        System.out.println(topla(27,6));
        int toplam =topla2(2,3,4,5,6,10);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void gunselle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    //variable ergument
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam += sayi;
        }

        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
