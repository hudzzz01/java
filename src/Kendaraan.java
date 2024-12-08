public class Kendaraan {
    private String merek;
    private Integer jumlahRoda;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public Integer getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(Integer jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public static void print (){
        System.out.println("ini adalah methot static");
    }

    Kendaraan(String nama, Integer roda){
        System.out.println("object ini dibuat" + nama);
    };
    Kendaraan(String nama){
        System.out.println("object ini dibuat");
    };

}
