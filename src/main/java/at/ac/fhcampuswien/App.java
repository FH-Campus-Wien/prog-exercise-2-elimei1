package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double largestNumber = Double.MAX_VALUE;
        int a;
        for (a = 1; a <= 1; a++) {
            System.out.println("Number " + a + ":");
            if (num <= 0) {
                System.out.println("The largest number is " + largestNumber);
            }
        }
    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i <= 0) {
            System.out.println("Invalid number!");
        }
        String string;

        int lines;
        int numbers;
        for (lines = 0; lines <= i; lines++) {
            for (numbers = 1; numbers <= i; numbers++) {
                if (lines >= numbers)
                    System.out.print(numbers);
            }
            System.out.println();
        }

}


    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int a = 6;
        int b;
        int c;
        int d;
    for (b = 1; b <= a; b++) {          // counts up until six lines are reached
            for (c = 5; c >= b; c--)    //counts down until spaces have reached 1
                System.out.print(" ");
            for (d = 1; d < 2*b; d++)   // counts up until * have reached 2 times the line number (-1)
                System.out.print("*");

            System.out.print(System.lineSeparator());
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        }

        int b;
        int d;
        int e;
        int g;
        int f;
        for (b = 1; b <= 4; b++) {          // without ASCII until now
            for (d = 4 - b; d >= 1; d--) {
                System.out.print(" ");
            }
            for (e = 1; e <= 2 * b - 1; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a <= 3; a++) {
            for (g = 1; g <= a; g++) {
                System.out.print(" ");
            }
            for (f = 5; f >= 2 * a - 1; f -= 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}