package com.company;

public class ParsAndBitwiseOperators {
    void PrintParsAndBitwiseOperators() {
        int i = 10;
        byte b = (byte) i;
        System.out.println(b);
        byte a = 12;
        byte a1 = 4;
        byte a2 = (byte) (a + a1);
        System.out.println(a2);
        float f = 15.5f;
        double d = f;
        System.out.println(d);
        double d1 = 25.9f;
        float f2 = (float) d1;
        System.out.println(f2);
        float f3 = 85;
        int x = (int) f3;
        System.out.println(x);
        int j = 4, k = 3;
        float y = (float) j / k;
        float result = (float) i / (float) j;
        float type = (float) ((j / k));
        System.out.println(y);
        System.out.println(result);
        System.out.println(type);

        byte Ьb;
        int ii = 257;
        double dd = 323.142;
        System.out.println(" \nCasting  int to the byte.");
        Ьb = (byte) ii;
        System.out.println(" ii и Ьb " + ii + " " + Ьb);

        System.out.println(" \nCasting douЫe to the int.");
        ii = (int) dd;
        System.out.println("dd и ii " + dd + " " + ii);
        System.out.println(" \nCasting  douЫe to the byte.");
        Ьb = (byte) dd;
        System.out.println("dd и Ьb " + dd + " " + Ьb);

        byte aaа = 40;
        byte Ьbb = 50;
        byte сcc = 100;
        int ddd = aaа * Ьbb / сcc;
        System.out.println(ddd);

        byte Ь8 = 42;
        char с8 = 'а';
        short s8 = 1024;
        int i8 = 50000;
        float f8 = 5.67f;
        double d8 = .1234;
        double result8 = (f8 * Ь8) + (i8 / с8) - (d8 * s8);
        System.out.println((f8 * Ь8) + " + " + (i8 / с8) + " - " + (d8 * s8));
        System.out.println(" result8 = " + result8);


        // bitwise operator NOT
        int bit = 42; // 00101010
        int not = ~bit; // 11010101 -43
        System.out.println(not);

        // bitwise operator AND
        int bit2 = 42; // 00101010
        int bit3 = 15; // 00001111
        int and = (bit2 & bit3); // 00001010 10
        System.out.println(and);

        //  bitwise operator OR
        int bit4 = 42; // 00101010
        int bit5 = 15; // 00001111
        int or = (bit4 | bit5); // 00101111 47
        System.out.println(or);

        //  bitwise operator XOR
        int bit6 = 42; // 00101010
        int bit7 = 15; // 00001111
        int xor = (bit6 ^ bit7); // 00100101 37
        System.out.println(xor);


        String[] binary = {
                "0000 ", "0001", " 0010", " 0011", "0100", "0101 ", "0110", "0111",
                " 1000 ", "1001 ", "1010 ", "1011", "1100", "1101", "1110", "1111"};
        int binа = 3; //  0011
        int binЬ = 6; //  0110
        int binс = binа | binЬ;
        int bind = binа & binЬ;
        int binе = binа ^ binЬ;
        int binf = (~binа & binЬ) | (binа & ~binЬ);
        int bing = ~binа & 0x0f;
        System.out.println(" binа = " + binary[binа]);
        System.out.println(" binЬ = " + binary[binЬ]);
        System.out.println(" binа | binЬ = " + binary[binс]);
        System.out.println(" binа & binЬ = " + binary[bind]);
        System.out.println(" binа ^ binЬ = " + binary[binе]);
        System.out.println(" ( ~binа & binЬ) | (binа & ~binЬ ) = " + binary[binf]);
        System.out.println(" ~binа = " + binary[bing]);


        // The Left Shift <<
        byte lefta = 64, leftЬ;
        int lefti;
        lefti = lefta << 2;
        leftЬ = (byte) (lefta << 2);
        System.out.println("lefta: " + lefta);
        System.out.println("lefti and leftЬ: " + lefti + " " + leftЬ);

        //The Right Shift >>
        int righta = 35; //00100011
        righta = righta >> 2; // 00001000 8
        System.out.println("righta : " + righta);

        int xx = 1;
        int yy = 2;
        int zz = 3;

        xx |= 4;
        yy >>= 1;
        zz <<= 2;
        xx ^= zz;
        System.out.println("xx : " + xx);
        System.out.println("yy : " + yy);
        System.out.println("zz : " + zz);
        System.out.println("xx : " + xx);

        //Relational Operators
        boolean boola = true;
        boolean boolb = false;
        boolean boolc = boola | boolb;
        boolean boold = boola & boolb;
        boolean boole = boola ^ boolb;
        boolean boolf = (!boola & boolb) | (boola & !boolb);
        boolean boolg = !boola;
        System.out.println("boola: " + boola);
        System.out.println("boolb: " + boolb);
        System.out.println("boola | boolb: " + boolc);
        System.out.println("boola & boolb: " + boold);
        System.out.println("boola ^ boolb: " + boole);
        System.out.println("(!boola & boolb) | (boola & !boolb): " + boolf);
        System.out.println("!boola: " + boolg);
        int aa = 20;
        int bb = 1;
        boolean cc = aa < bb;
        System.out.println("cc: " + cc);

        boolean ee = (aa < 1) || (5 > bb);
        System.out.println(ee);
        boolean eee = (aa < 1) && (5 > bb);
        System.out.println(eee);


    }

}
