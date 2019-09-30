package org.fasttrackit;

import java.util.Scanner;

// Exercitiile sunt rezolvate in ordinea din Tema
public class ExercisesLoopFor {
    public static void Numbers() {
        System.out.println(" Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int n = 100;
        System.out.println(" The numbers until " + n + " are: ");
        for (int i = firstNumber; i <= n; i++) {
            System.out.print(i + " ");

        }
    }

    public static void Numbers2() {
        System.out.println(" Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int n = -100;
        System.out.println(" The numbers until " + n + " are: ");
        for (int i = firstNumber; i >= n; i--) {
            System.out.print(i + " ");

        }
    }

    public static void Numbers3() {
        int x = 3;
        int y = 16;
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }

    }

    public static void Numbers4() {

        int x = 20;
        int y = 10;
        if (x > y) {
            for (int i = y; i <= x; i++) {
                System.out.print(i + " ");
            }
        }else {
            for( int i=x; i<=y; i++){
                System.out.print(i+ " ");
            }
        }
    }

        public static void EvenNumbers () {
            System.out.println(" The even Numbers until 100 are: ");
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void OddNumbers () {
            System.out.println(" The odd Numbers until 100 are: ");
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void SumNumbers () {
            System.out.println(" Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            int n = 100;
            int sum = 0;
            for (int i = firstNumber; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(" The sum numbers until " + n + " are: " + sum);

        }

        public static void MediaNumbers () {
            System.out.println(" Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            double med;
            int sum = 0;
            int n = 100;
            for (int i = firstNumber; i <= n; i++) {
                sum = sum + i;
            }
            med = sum / (n - firstNumber);
            System.out.println(" The average numbers are: " + med);

        }
        public static void Array (String[][]sir){
            String[][] sir_name = {{"*******"}, {"******"}, {"*****"}, {"****"}, {"***"}, {"**"}, {"*"}};
            System.out.println(sir_name[0][0]);
            for (int i = 0; i < sir.length; i++) {
                System.out.println("Element( " + i + " ): ");// este optional :precizeaza elementul
                for (int j = 0; j < sir[i].length; j++) {
                    System.out.println(" " + sir[i][j]);
                }
                System.out.println();
            }

        }
    }

