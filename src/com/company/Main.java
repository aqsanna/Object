package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Box myBox1 = new Box();
        Box myBox2 = myBox1;
        double vol;

        myBox2.widht = 10;
        myBox1.heigth = 20;
        myBox1.depth = 15;

        myBox2.widht = 3;
        myBox2.heigth = 6;
        myBox2.depth = 9;

        vol = myBox1.heigth * myBox1.widht * myBox1.depth;
        System.out.println(myBox1.heigth);
        System.out.println(myBox1.widht);
        System.out.println(myBox1.depth);
        System.out.println("----------------");
        System.out.println(myBox2.heigth);
        System.out.println(myBox2.widht);
        System.out.println(myBox2.depth);

        Maximum maxvalue = new Maximum();
        int result = maxvalue.Max(8, 5);
        System.out.println(result);
        System.out.println(maxvalue.HomeWork(true, 9.2));
        Maximum FirstMax = new Maximum();
        boolean bool = FirstMax.isFirstMax(17, 9);
        System.out.println("isFirstMax i,s: " + bool);

        System.out.println("Անգլերենի բոլոր մեծատառերը");
        Alphabet alphabetCapitalLetter = new Alphabet();
        alphabetCapitalLetter.CapitalLetter();
        Alphabet alphabetCapitalLetterChar = new Alphabet();
        alphabetCapitalLetterChar.CapitalLetterChar();
//	    Alphabet alphabetint = new Alphabet();
//	    alphabetint.CalitalLetterint(65);
        System.out.println("Անգլերենի բոլոր փոքրատառերը");
        Alphabet alphabetLowerCase = new Alphabet();
        alphabetLowerCase.LowerCase();
        Alphabet alphabetLowerCaseChar = new Alphabet();
        alphabetLowerCaseChar.LowerCaseSecond();



        ControlStatements controlStatements = new ControlStatements();
        System.out.println(controlStatements.MaxNumber(5,8,-6));
        IterationStatements iterationStatements = new IterationStatements();
        System.out.println(iterationStatements.PrintSumNumbers(100));

    }
}
