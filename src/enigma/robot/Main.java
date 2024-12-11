package enigma.robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Error Handling
        try{
            run(scanner);
        }catch (Exception e){
            System.out.println("(0,0) pake KOMA Sepertinya input yang anda masukan tidak seusai ");
            System.out.println("Error Brow : "+ e);
        }


    }

    public static void displayMove(Robot robot, String move){
        System.out.print(move+"->");
        System.out.println(robot.getCordinat());
    }

    public static void run(Scanner scanner){
        //input posisi awal
        System.out.print("Tentukan Posisi Awal Robot : ");
        String posisiAwalRobot = scanner.nextLine();
        String[] arrPosisi = posisiAwalRobot.split(",");

        //handling
        Integer xAwal = Integer.parseInt(arrPosisi[0]);
        Integer yAwal = Integer.parseInt(arrPosisi[1]);

        //input moving
        System.out.print("Input Perintah : ");
        String perintah = scanner.nextLine().toUpperCase();
        String[] perintahArr = perintah.split("");

        //inisialisasi object robot
        Robot myRobot = new Robot(xAwal,yAwal);

        //Display moving
        System.out.println("kordinat awal : " +myRobot.toString());

        for( String move : perintahArr){
            if (move.equals("R")){
                myRobot.R(myRobot);
                displayMove(myRobot,"R");
            }else
            if (move.equals("L")){
                myRobot.L(myRobot);
                displayMove(myRobot,"L");
            }else
            if (move.equals("F")){
                myRobot.F(myRobot);
                displayMove(myRobot,"F");
            }else
            if (move.equals("B")){
                myRobot.B(myRobot);
                displayMove(myRobot,"B");
            }
        }
    }
}