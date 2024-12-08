public class Main3 {
    public static void main(String[] args) {

        Kendaraan mobil = new Kendaraan("mobil");
        Kendaraan motor = new Kendaraan("motor");

        listBarang("kursi", "meja");
        listBarang("koper");


//
//        mobil.setMerek("Wuling");
//        System.out.println(mobil.getMerek());
    }

    public static void listBarang(String barang1, String barang2){
        System.out.println("ini adalah list barang2 saya " + barang1 + barang2);
    }

    public static void listBarang(String barang1){
        System.out.println("ini adalah list barang2 saya" + barang1);
    }

    public static void listBarang(){
        System.out.println("ini adalah list barang2 saya");
    }


}
