import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Set the half pyramid high:");


        if (scan.hasNextByte()) {
            byte validNum = scan.nextByte();
            for (byte i = validNum; i >= 1; i--) {
                for (byte j = i; j <= validNum; j++) {
                    System.out.print('#');
                }
                if (i != 1) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("Please, enter a integer number!");
        }
    }
}




