package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        double largestNumber = 0;
        double num = 1;
        int b;

            for (b = 0; b < num; b++) {

                for (a = 1; a > 0; a++) {
                    System.out.print("Number " + a + ": ");
                    num = scanner.nextDouble();

                    if (num <= 0) {
                        if (a == 1) {
                            System.out.print("No number entered.");
                            System.out.println();
                            break;
                        }
                    }

                    if (num <= 0) {
                        System.out.println("The largest number is " + String.format("%.2f", largestNumber) );
                        break;
                    }
                    if (num > largestNumber) {
                        largestNumber = num;
                    }
                }
            }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        int num = 0;
        int lines;
        int numbers;

        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i <= 0) {
            System.out.println("Invalid number!");
        }

        for (lines = 0; lines <= i; lines++) {
            for (numbers = 0; numbers < lines; numbers++) {
                num++;
                System.out.print(num + " ");
            }
                if (lines != 0) {
                    System.out.println();
                }
        }
    }


    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int a = 6;
        int b;
        int c;
        int d;
        for (b = 1; b <= a; b++) {
            for (c = 5; c >= b; c--)
                System.out.print(" ");
            for (d = 1; d < 2 * b; d++)
                System.out.print("*");

            System.out.print(System.lineSeparator());
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        int b;
        int d;
        int e;
        int g;
        int f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        } else {

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
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        int grade = 0;
        int a;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int b;
        int negativeMarks = 0;
        double average = 0;

        for (b=0; b <= grade; b++) {

            for (a = 1; a >= 1; a++) {
                System.out.print("Mark " + a + ": ");
                grade = scanner.nextInt();
                if (grade > 5 || grade < 0) {
                    System.out.println("Invalid mark!");
                    a--;
                }
                if (grade == 0) {
                    System.out.println("Average: " + String.format("%.2f", average));
                    System.out.println("Negative marks: " + negativeMarks);
                    break;
                }
                if (grade == 5) {
                    negativeMarks++;
                }
                if (grade <= 5 && grade >= 1) {
                    count++;
                    sum = sum + grade;

                }
                average = sum / count;
            }
        }
    }

    //todo Task 6
    public int happyNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int singleDigit = 1;

        System.out.print("n: ");
        int number = scanner.nextInt();
        while (number > 9) {
            while (number > 0) {
                singleDigit = number % 10;
                sum = (sum + (singleDigit * singleDigit));
                number = number / 10;
            }
            number = sum;
            sum = 0;
        }

        if (number == 1) {
            System.out.println("Happy number!");

        } else {
            System.out.println("Sad number!");
        }

        return sum;  // java suggests it for me, I don't know why
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