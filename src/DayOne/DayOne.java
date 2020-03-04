package DayOne;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class DayOne {
    public static void main(String[] args) throws FileNotFoundException {
        partOne();
        // partTwo();


    }

    public static void partOne() throws FileNotFoundException {

        File day1File = new File("teahnealH-aoc19/src/DayOne/day-one.txt");
        Scanner scanned = new Scanner(day1File);

        int fuelTotal = 0;

        while(scanned.hasNextLine()) {
            String input = scanned.nextLine().trim();

            int mass = Integer.parseInt(input);

            fuelTotal += Math.floor(mass / 3) - 2;

        }
        System.out.println(fuelTotal);
        scanned.close();
    }

    public static void partTwo() throws FileNotFoundException {
        
        File day1File = new File("teahnealH-aoc19/src/DayOne/day-one.txt");
        Scanner scanned = new Scanner(day1File);

        int fuelTotal = 0;

        while(scanned.hasNextLine()) {
            String input = scanned.nextLine().trim();

            int mass = Integer.parseInt(input);

            int fuel = 0;

            double test = Math.floor(mass / 3) - 2;

            while((test) != 0) {
                test = Math.floor(test / 3) - 2;
                fuel += test;
            }

            fuelTotal += fuel;

        }

        System.out.println(fuelTotal);
        scanned.close();

    }
}