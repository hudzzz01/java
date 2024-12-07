import java.util.ArrayList;
import java.util.Scanner;

public class HurufGanda {
    public static void main(String[] args){
        ArrayList result = new ArrayList();
        Scanner myInput = new Scanner(System.in);

        System.out.print("Masukan Kata uji :");

        String realStringInput = myInput.nextLine();

        StringBuilder stringInput = new StringBuilder(realStringInput);



        while (stringInput.length() != 0){
            char xPembeda = stringInput.charAt(0);

            for (int i = 1; i < stringInput.length() ; i++) {
                char yPembeda = stringInput.charAt(i);
                boolean flag = false;

                if(xPembeda == yPembeda){
                    if(result.size() == 0){
                        result.add(xPembeda);
                    }
                    for (int j = 0; j < result.size() ; j++) {
                        if(xPembeda == result.get(j).toString().charAt(0)){
                            flag = true;
                        }
                    }
                    if(flag){
                        break;
                    }
                    result.add(xPembeda);
                    stringInput.deleteCharAt(i);
                }
                
            }
            stringInput.deleteCharAt(0);
        }
        System.out.print(result);
    }
}
