package com.company;

public class PrimitiveType {

    void printByteType() {
        // byte type
        byte a1 = 0;
        byte b1 = 85, t88 = 127;
        byte m1 = -128;
        System.out.println("byte type example");
        System.out.println("a1 is: " + a1);
        System.out.println("b1 is: " + b1);
        System.out.println("m1 is: " + m1);
        System.out.println("m1 is: " + t88);
    }

    void printShortType() {
        // short type
        short a2 = 129;
        short b2 = 32767;
        short m2 = -32768;
        System.out.println("short type example");
        System.out.println("a2 is: " + a2);
        System.out.println("b2 is: " + b2);
        System.out.println("m2 is: " + m2);
    }

    void printIntType() {
        // int type
        int a3 = 32768;
        int b3 = 2147483647;
        int m3 = -2147483648;
        System.out.println("int type example");
        System.out.println("a3 is: " + a3);
        System.out.println("b3 is: " + b3);
        System.out.println("m3 is: " + m3);
    }

    void printLongType() {
        // long type
        long a4 = 2147483648L;
        long b4 = 9223372036854775807L;
        long m4 = -9223372036854775808L;
        System.out.println("long type example");
        System.out.println("a4 is: " + a4);
        System.out.println("b4 is: " + b4);
        System.out.println("b4 is: " + b4);

        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000; // приблизительная скорость света , миль в секунду
        days = 1000; // указать количества дней
        seconds = days * 24 * 60 * 60; // преобразовать в секунды
        distance = lightspeed * seconds; // вычислить расстояние
        System.out.print(" Зa " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");

    }

    void printFloatType() {
        // float type
        float f5;
        f5 = 12.5F;
        float m5 = -922000003372036800000054775808F;
        System.out.println("float type example");
        System.out.println("f5 is: " + f5);
        System.out.println("m5 is: " + m5);
    }

    void printDoubleType() {
        // double type
        double l6;
        l6 = 148.5;
        double m6 = -92200000337203680000005477580.4551114;
        System.out.println("double type example");
        System.out.println("l6 is: " + l6);
        System.out.println("m6 is: " + m6);

        double pi, r, a;
        r = 10.8; //радиус окружности
        pi = 3.1416;  //приблизительное значение числа пи
        a = pi * r * r; //вычислить площадь круга
        System.out.println("Плoщaдь круга равна " + a);
    }

    void printCharType() {
        //char type
        char ch1 = 'Y';
        char ch2 = 'M';
        char ch3 = 88;
        System.out.println("char type example");
        System.out.println("ch1 is: " + ch1);
        System.out.println("ch2 is: " + ch2);
        System.out.println("ch3 is: " + ch3);

        char text1, text2;
        text1 = 88; // код символа Х
        text2 = 'Y';
        System.out.print(" text1 и text2:");
        System.out.println(text1 + " " + text2);
    }

    void printBoolType() {
        //boolean type
        boolean b;
        b = false;
        boolean t = true;
        System.out.println("boolean type example");
        System.out.println("b is: " + b);
        System.out.println("t is: " + t);

        //. Управляющие последовательности символов

        System.out.println("text1\\text2");
        System.out.println("text1'text2");
        System.out.println("text1\"text2");
        System.out.println("text44\rtext55");
        System.out.println("text3\ntext4");
        System.out.println("text111\ftext222");
        System.out.println("texttttt\tTTextTTTTT");
        System.out.println("textB\bBtext");

    }
}
