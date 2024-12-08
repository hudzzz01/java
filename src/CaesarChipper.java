import java.util.Scanner;

public class CaesarChipper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String plainTeks = "";
        String chipperText = "";
        int key = 0;
        int choice = 0;

        System.out.println("------------SELAMAT DATANG DI PROGRAM ENKRIPSI CAESAR CHIPPER");
        System.out.print("Maskan kata-kata yang ingin di enkripsi/dekripsi : ");
        plainTeks = scanner.nextLine().toLowerCase();

        System.out.print("Masukan kunci berupa angka : ");
        try{
            key = scanner.nextInt();
            System.out.println("Apa yang ingin anda lakukan ? \n1. Enkripsi \n2. Dekripsi \n ------------------");
            System.out.print("Masukan input anda : ");
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Input yang dimasukan harus berupa angka ! ");
        }

        if (choice == 1){
            chipperText = enkrip(plainTeks,key);
            System.out.println( "Hasil enkripsinya adalah : " + chipperText);
        }else if(choice ==2){
            plainTeks = dekrip(plainTeks,key);
            System.out.println("hasil dekripsinya adalah : " + plainTeks);
        }





    }

    public static String enkrip(String plainTeks, int key){
        String abjad = "abcdefghijklmnopqrstuvwxyz";
        String angka = "0123456789";
        Integer indexAbjad = null;
        Integer indexAngka = null;
        String chipperText = "";
        char a = ' ';
        char c = ' ';

        for (int i = 0; i < plainTeks.length() ; i++) {
            char x = plainTeks.charAt(i);

            for (int j = 0; j < abjad.length() ; j++) {
                char y = abjad.charAt(j);

                if(y == x){
                    indexAbjad = j;
                }

            }

            if(indexAbjad!= null){
//                indexAbjad = indexAbjad + key > 26 ? indexAbjad-26 +key : indexAbjad + key;
                indexAbjad = indexAbjad + key >= 26 ? (indexAbjad + key) %26: indexAbjad +key;

            }


            for (int j = 0; j < angka.length() ; j++) {
                char y = angka.charAt(j);

                if(y == x){
                    indexAngka= j;
                }

            }

            if(indexAngka != null){
//                indexAngka = indexAngka + key > 10 ? indexAngka - 10 +key : indexAngka + key;
                indexAngka = indexAngka + key >= 10 ? (indexAngka + key) % 10 : indexAngka + key;
//
//                System.out.println(indexAngka);
//                System.exit(1);

            }



            if(indexAngka != null){
                a = angka.charAt(indexAngka);
            }else if(indexAbjad != null){
                c = abjad.charAt(indexAbjad);
            }

            if(x == ' '){
                chipperText += ' ';
            }else{
                if(indexAbjad != null){
                    chipperText += c;
                }else{
                    chipperText += a;
                }
            }

            indexAngka = null;
            indexAbjad = null;

        }

        return chipperText;
    }

    public static String dekrip(String chipperteks, int key){

        String abjad = "abcdefghijklmnopqrstuvwxyz";
        String angka = "0123456789";
        Integer indexAbjad = null;
        Integer indexAngka = null;
        String plainTeks = "";
        char a = ' ';
        char c = ' ';

        for (int i = 0; i < chipperteks.length() ; i++) {
            char y = chipperteks.charAt(i);

            for (int j = 0; j < abjad.length(); j++) {
                char x = abjad.charAt(j);

                if (x == y) {
                    indexAbjad = j;
                }

            }

            if (indexAbjad != null) {
//                indexAbjad = indexAbjad - key < 0 ? indexAbjad + 26 - key : indexAbjad - key;
//                indexAbjad = indexAbjad - key < 0 ? indexAbjad - (key %26)  : indexAbjad - key;

//                System.out.println(indexAbjad);

                if(indexAbjad - key < 0){
                    indexAbjad = (indexAbjad - (key %26));
                    if(indexAbjad < 0){
                        indexAbjad += 26;
                    }
                }else {
                    indexAbjad -= key;
                }
//
//                System.out.println(indexAbjad);
//                System.exit(1);
            }


            for (int j = 0; j < angka.length() ; j++) {
                char x = angka.charAt(j);

                if(x == y){
                    indexAngka= j;
                }

            }

            if(indexAngka != null){
//                indexAngka = indexAngka - key < 0 ? indexAngka + 10 - key : indexAngka - key;
//                indexAngka = indexAngka - key < 0 ? (indexAngka - key) %10 : indexAngka - key;
//                System.out.println(indexAngka);

                if(indexAngka - key < 0){
                    indexAngka = (indexAngka - (key %10));
                    if(indexAngka < 0){
                        indexAngka += 10;
                    }
                }else {
                    indexAngka -= key;
                }




            }

            if(indexAngka != null){
                a = angka.charAt(indexAngka);
            }else if(indexAbjad != null){
                c = abjad.charAt(indexAbjad);
            }

            if(y == ' '){
                plainTeks += ' ';
            }else{
                if(indexAbjad != null){
                    plainTeks += c;
                }else{
                    plainTeks += a;
                }
            }
            indexAngka = null;
            indexAbjad = null;

        }

        return plainTeks;
    }

}
