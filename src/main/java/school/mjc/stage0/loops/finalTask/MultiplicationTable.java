package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+numberTableToPrint+" = "+i*numberTableToPrint);
        }
    }
}
