package DayOne;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class DayOne {
    public static void main(String[] args) throws FileNotFoundException {

        File day1File = new File("day-one.txt");
        Scanner scanned = new Scanner(day1File);

        int fuelTotal = 0;

        while(scanned.hasNextLine()) {
            String input = scanned.nextLine().trim();

            int mass = Integer.parseInt(input);

            fuelTotal += Math.floor(mass / 3) - 2;
        }

        System.out.println(fuelTotal);
    }
}