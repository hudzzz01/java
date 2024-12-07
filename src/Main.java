//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        String banner = "Selamat Datang di perogram melihat binnary \n Silahkan masukan kata-kata anda :";
        System.out.print(banner);
        String kataKata = String.valueOf(myInput.nextLine());


        String hasil = convertStringToBinary(kataKata);

        System.out.println(hasil);

    }

    public static String convertStringToBinary(int kataKata){
        return "yang harus kamu masukan adalah string";
    }

    public static String convertStringToBinary(String kataKata){
        String allBinary = "";
        for(var i = 0; i<kataKata.length(); i++){
            var huruf = kataKata.charAt(i);
            var decValue = Integer.valueOf(huruf);

            String bin = "";
            while (decValue > 0){
                if(decValue%2 == 0){
                    bin += 0;
                }else {
                    bin += 1;
                }
                decValue /= 2;



            }

            String binary = "";
            for (int j = bin.length()-1; j >= 0; j--) {
                binary += bin.charAt(j);
            }

//            System.out.println(binary);
            allBinary += huruf + " => " + binary + "\n";


        }

        return allBinary;
    }
}