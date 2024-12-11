package enigma.robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tentukan Posisi Awal Robot : ");
        String posisiAwalRobot = scanner.nextLine();
        String[] arrPosisi = posisiAwalRobot.split(",");

        Integer xAwal = Integer.parseInt(arrPosisi[0]);
        Integer yAwal = Integer.parseInt(arrPosisi[1]);

        System.out.print("Input Perintah : ");
        String perintah = scanner.nextLine().toUpperCase();
        String[] perintahArr = perintah.split("");

        Robot myRobot = new Robot(xAwal,yAwal);

        System.out.println("kordinat awal : " +myRobot.toString());

        for( String move : perintahArr){
            if (move.equals("R")){
                myRobot.R(myRobot);
                move(myRobot,"R");
            }else
            if (move.equals("L")){
                myRobot.L(myRobot);
                move(myRobot,"L");
            }else
            if (move.equals("F")){
                myRobot.F(myRobot);
                move(myRobot,"F");
            }else
            if (move.equals("B")){
                myRobot.B(myRobot);
                move(myRobot,"B");
            }
        }
    }

    public static void move(Robot robot, String move){
        System.out.print(move+"->");
        System.out.println(robot.getCordinat());
    }
}