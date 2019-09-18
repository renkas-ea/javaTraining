package game;

import java.util.Random;
import java.util.Scanner;


public class Game {
    //в задании не указан диапазон значений, но без него - никогда не угадать
    private int randomNum = new Random().nextInt(100);
    private Scanner scanner = new Scanner(System.in);

    public void gamePlay() {
        System.out.println(randomNum);
        Integer prevScanNum = null;
        while (true) {
            System.out.println("Введите число:");
            int scannerNum = scanner.nextInt();
            if (prevScanNum == null) {
                prevScanNum = scannerNum;
                //dt - зачем ?? 
                continue;
            }

            if (randomNum == scannerNum) {
                System.out.println("Успех");
                break;
            }

            //dt - условия не покрывают все случаи. 
            if (Math.abs(prevScanNum - randomNum) > Math.abs(scannerNum - randomNum)) {
                System.out.println("Горячо");
            } else if (Math.abs(prevScanNum - randomNum) < Math.abs(scannerNum - randomNum)) {
                System.out.println("Холодно");
            }
            prevScanNum = scannerNum;

        }
    }


}
