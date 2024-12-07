import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hasil = 0.0;

        while (hasil == 0.0){
            try{

                hasil =  displayMenu();

                if (hasil != 0.0) {
                    System.out.println("Hasilnya adalah : " + hasil);
                }


            } catch (Exception e) {
                System.out.println("input tidak valid");
            }
        }

        System.out.println("Selesai");



    }

    public static Double displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("--SELAMAT DATANG DI KALKULATOR SEDERHANA SAYA");
        System.out.println(
                        "1. Luas dan Keliling lingkaran \n" +
                        "2. Luas dan keliling segitiga \n" +
                        "3. Luas persegi / persegi panjang\n" +
                        "0. Keluar\n" +
                         "-----------------\n"

        );

        System.out.print("Masukan input anda : ");

        Integer pilihan1 = scanner.nextInt();

        switch (pilihan1){
            case 1 :
                System.out.println(
                        "1. Input berupa diameter (Luas)\n" +
                        "2. Input berupa jari-jari (Luas)\n" +
                        "3. Input berupa diameter (Keliling)\n" +
                        "4. Input berupa jari-jari (Keliling)\n" +
                        "99. Kembali \n" +
                        "0. Keluar \n" +
                        "-----------------\n"
                );
                System.out.print("Masukan input anda : ");

                Integer pilihan2 = scanner.nextInt();

                switch (pilihan2){
                    case 1 :
                        System.out.print(
                                "Masukan diameter : "
                        );
                        double diameter = scanner.nextInt();

                        return  MyMath.lingkaran.menghitungLuasLingkaranDiameter(diameter);


                    case 2 :

                        System.out.print(
                                "Masukan jari-jari : "
                        );
                        double r = scanner.nextInt();

                        return  MyMath.lingkaran.menghitungLuasLingkaranJariJAri(r);


                    case 3 :
                        System.out.print(
                                "Masukan diameter: "
                        );
                        double diameterKeliling = scanner.nextInt();

                        return  MyMath.lingkaran.menghitungKelilingLingkaranDiameter(diameterKeliling);


                    case 4 :
                        System.out.print(
                                "Masukan jari-jari: "
                        );
                        double rKeliling = scanner.nextInt();

                        return  MyMath.lingkaran.menghitungKelilingLingkaranDiameter(rKeliling);


                    case 0 :
                        System.exit(0);
                        break;

                    case 99 :
                        return 0.0;


                    default:
                        System.out.println("Input tidak sesuai");

                }

                break;

            case 2 :
                System.out.println(
                        "1. Keliling segitiga \n" +
                        "2. Luas segitiga \n"
                );



                break;

            case 3 :
                System.out.println(
                        "1. luas persegi panjang \n" +
                        "2. luas segitiga \n "
                );
                break;

            case 0 :
                exitProgram();
                break;

            default:
                System.out.println("input tidak sesuai");

        }

        return 0.0;
    };

    public static void exitProgram(){
        System.exit(0);
    }
}
