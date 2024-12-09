import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //input inisialisation
        Scanner scanner = new Scanner(System.in);

        //input banyak bambu
        System.out.print("Berapa bambu ? : ");
        String banyakBambo = scanner.nextLine();
        int banyakBamboInt = Integer.parseInt(banyakBambo);

        //input banyak bilah masing-masing bambu
        int[] tempatBambo = new int[banyakBamboInt];
        for (int i = 0; i < banyakBamboInt ; i++) {
            System.out.print("Input bambu ke-" + (i+1) + " = ");
            tempatBambo[i] = scanner.nextInt();
            scanner.nextLine();
        }

        //input banyaknya dipotong
        System.out.println("Input berapa kali dipotong = ");
        int banyakPotong = scanner.nextInt();
        scanner.nextLine();

        //display jumlah bambu awal
        System.out.println("Initials:");
        for (int bambo : tempatBambo){
            System.out.print("|");
            for (int j = 0; j < bambo ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        //display loop ketika dipotong
        for (int i = 0; i < banyakPotong; i++) {
            //logic kurangin bilah bambu
            for (int j = 0; j < tempatBambo.length; j++) {
                //bambo => tempatBambo[j]
                if(tempatBambo[j] > 0){
                    tempatBambo[j] -= 1;
                }
            }

            //display pengurangan bilah bambu
            System.out.println("Pemotongan ke-" + (i+1));

            for (int bambo : tempatBambo){
                System.out.print("|");
                for (int j = 0; j < bambo ; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }

        }

    }
}