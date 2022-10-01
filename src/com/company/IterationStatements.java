package com.company;

import java.io.IOException;

public class IterationStatements {
    void IterationStatementsMethod() throws IOException {

        for (int i = 12; i <= 17; i++) {
            System.out.println(i);
        }
        char choice;
        do {
            System.out.println(" Cпpaвкa по оператору : ");
            System.out.println(" 1. i f ");
            System.out.println(" 2. switch");
            System.out.println(" З. whil e");
            System.out.println(" 4. do-while ");
            System.out.println(" 5. for\n");
            System.out.println(" Bыбepитe нужный пункт:");
            choice = (char) System.in.read();
        }
        while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("if: \n");
                System.out.println("if ( ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println(" switch:\n");
                System.out.println(" switch ( выpaжeниe ) {");
                System.out.println(" сазе константа : ");
                System.out.println(" последовательность операторов ");
                System.out.println(" break; ");
                System.out.println(" // ... ");
                System.out.println(" } ");
                break;
            case '3':
                System.out.println("while : \n");
                System.out.println("while ( ycлoвиe ) оператор ; ");
                break;
            case '4':
                System.out.println(" do-whi le : \n ");
                System.out.println("do {");
                System.out.println(" оператор ; ");
                System.out.println("} while ( условие ) ;");
                break;
            case '5':
                System.out.println("for : \n");
                System.out.print("for ( инициaлиэaция; условие ; итерация } ");
                System.out.println(" оператор ; ");
                break;
        }
    }

    int PrintEvenNumber(int x) {
        // tpel zuyg tvery
        int n;
        System.out.println("0-100 mijakayqum zuyq tvern en");
        for (n = 0; n < 100; n++) {
            if (n % 2 == 0) {
                System.out.println("n = " + n);
            }
        }
        return n++;
    }

    int PrintOddNumbers(int x) {

        // tpel kent tvery
        System.out.println("0-100 mijakayqum kent tvern en");
        for (int i = 0; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }
        return x;
    }

    int PrintDivicethree(int x) {
        // tpel 3-i bajanvox tvery
        System.out.println("0 -100 mijakayqum tver voronq bajanvum en 3-i");
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
        }
        return x;
    }

    double PrintFactorialNumber(int x) {

        // tpel 0-100 tveri factorialy
        double y = 1;
        System.out.println("0-100 tveri faktorial");
        for (int i = 1; i <= x; i++) {
            y = y * i;
        }
        return y;
    }

    int PrintSumNumbers(int x) {
        // tpel 0-100 tveri gumary
        int l = 0, h = 0;
        System.out.println("0-100 tveri gumary");
        while (h <= x) {
            l = l + h;
            h++;
        }
        return l;
    }

    void PrintFigurs() {
        // tpel patkerner

        /*
         ******
         *****
         ****
         ***
         **
         *
         */
        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("%");
            }
            System.out.println();
        }

        /*
        -
        --
        ---
        ----
        -----
         */
        System.out.println("-------------------");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("-");

            }
            System.out.println();
        }

        /*
               1
              2 1
             3 2 1
            4 3 2 1
         */
        System.out.println("-------------------");
        for (int i = 1; i < 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int c = i; c > 0; c--) {
                System.out.print(" " + c);
            }
            System.out.println(" ");
        }
        /*
        qarakusi
        * * * *
        * * * *
        * * * *
        * * * *
         */
        System.out.println("-------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }

        /*
           # ## ### ####
           # ## ###
           # ##
           #
         */
        System.out.println("-------------------");
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                for (int k = 0; k < j; k++) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }

        /*
            $
           $$
          $$$
         $$$$
        $$$$$
         */
        System.out.println("-------------------");
        for (int i = 0; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        /*
        ######
         #####
          ####
           ###
            ##
             #
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    void PrintLoopsSt() {
        // fory fori mej
        for (int i = 1; i < 11; i++) {
            System.out.println("i = " + i);
            System.out.println("^^^^^^^^^^^^^^^");

            for (int j = 1; j < 11; j++) {
                System.out.println(" j = " + j);
            }
            System.out.println("^^^^^^^^^^^^^^^");
        }
        // whiley whilei mej
        int i = 1;
        while (i < 11) {
            System.out.println("i = " + i);
            System.out.println("///////////");
            int j = 1;
            while (j < 11) {
                System.out.println("j = " + j);
                j++;
            }
            i++;
        }
        System.out.println("///////////");

        // fory whili mej
        int a = 1;
        while (a < 11) {
            System.out.println("a = " + a);
            System.out.println("_____________");
            for (int b = 1; b < 11; b++) {
                System.out.println("b = " + b);
            }
            a++;
        }
        System.out.println("_____________");

        // whily fori mej
        for (int d = 1; d < 11; d++) {
            System.out.println("d = " + d);
            System.out.println("!!!!!!!!!!!!!!!");
            int s = 1;
            while (s < 11) {
                System.out.println("s = " + s);
                s++;
            }
            System.out.println("!!!!!!!!!!!!!!!");
        }
    }
}


