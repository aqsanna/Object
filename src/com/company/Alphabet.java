package com.company;

public class Alphabet {

    void capitalLetter() {
        for (int i = 65; i <= 65 + 25; i++) {
            System.out.println((char) i + ":" + i);
        }
    }
//    int calitalLetterint(int x ){
//        for(int i =x; i <= x +25; i++){
//            System.out.println((char)i + ":" + i);
//        }
//        return x;
//    }

    void capitalLetterChar() {
        char c = 'A';
        while (c <= 'Z') {
            System.out.println(c);
            c++;
        }
    }

    void lowerCase() {
        char p = 'a';
        while (p <= 'z') {
            System.out.println(p);
            p++;
        }
    }

    void lowerCaseSecond() {
        for (int t = 97; t <= 122; t++) {
            System.out.println("Lower Case: " + (char) t);
        }
    }

}
