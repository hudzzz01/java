import java.util.Scanner;

public class Main {
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

                        return  Rumus.lingkaran.menghitungLuasLingkaranDiameter(diameter);


                    case 2 :

                        System.out.print(
                                "Masukan jari-jari : "
                        );
                        double r = scanner.nextInt();

                        return  Rumus.lingkaran.menghitungLuasLingkaranJariJAri(r);


                    case 3 :
                        System.out.print(
                                "Masukan diameter: "
                        );
                        double diameterKeliling = scanner.nextInt();

                        return  Rumus.lingkaran.menghitungKelilingLingkaranDiameter(diameterKeliling);


                    case 4 :
                        System.out.print(
                                "Masukan jari-jari: "
                        );
                        double rKeliling = scanner.nextInt();

                        return  Rumus.lingkaran.menghitungKelilingLingkaranDiameter(rKeliling);


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
                System.out.println("-----------------------");
                System.out.print("Masukan pilihan anda : ");

                Integer pilihan3 = scanner.nextInt();

                switch (pilihan3){
                    case 1:
                        System.out.print("Masukan nilai a ");
                        double a = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Masukan nilai b");
                        double b = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Masukan nilai c ");
                        double c = scanner.nextInt();
                        scanner.nextLine();

                        double hasil =  Rumus.segitiga.menghiungKelilingSegitiga(a,b,c);
                        System.out.print("Hasilnya adalah : " + hasil);

                        break;

                    case 2:
                        System.out.print("Masukan nilai alas :");
                        double alas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Masukan nilai tinggi :");
                        double tinggi = scanner.nextInt();
                        scanner.nextLine();

                        double hasilLuasSegitiga = Rumus.segitiga.menghitungLuasSegitiga(alas,tinggi);

                        System.out.print("Hasilnya adalah : " + hasilLuasSegitiga);
                }




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
