package com.company;

public class Operators {
    void PrintOperators() {
        System.out.println("integer type operators");
        int a = 1 + 1;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -c;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        System.out.println("c is: " + c);
        System.out.println("d is: " + d);
        System.out.println("e is: " + e);

        System.out.println("double type operators");
        double da = 1 + 1;
        double db = da * 2;
        double dc = db / 2;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da is: " + da);
        System.out.println("db is: " + db);
        System.out.println("dc is: " + dc);
        System.out.println("dd is: " + dd);
        System.out.println("de is: " + de);


        System.out.println("Modulus Operator");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10: " + x % 10);
        System.out.println("y mod 10: " + y % 10);


        System.out.println("Assignment Operators");
        a = a + 5;
        System.out.println(a);
        a += 6;
        System.out.println(a);
        a = a % 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);

        int g = 1;
        int h = 2;
        int l = 3;


        g += 5;
        h *= 3;
        l -= 2;
        h += g * l;
        l %= 2;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("l = " + l);

    }

    void PrintIncrementAndDecrement() {
        System.out.println("Increment and Decrement");
        int x = +1;
        x++;
        System.out.println(x);

        x = x - 1;
        x--;
        System.out.println(x);

        x = 33;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

        x = 25;
        ++x;
        System.out.println(x);

        int a = 1;
        int b = 2;
        int c = ++b;
        int d = a++;
        c++;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        System.out.println("c is: " + c);
        System.out.println("d is: " + d);

        int i = 4, j = 3;
        float result;
        System.out.println((float) i / j);

    }
}