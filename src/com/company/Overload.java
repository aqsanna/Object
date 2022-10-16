package com.company;

public class Overload {
    int a, b;
    Overload(int i, int j){
        a = i;
        b = j;
    }
    Overload(){

    }
    boolean equalTo(Overload o){
        if(o.a == a && o.b == b) return  true;
        else return  false;
    }

    void test(){
        System.out.println("No parameters");
    }
    void test(int a){
        System.out.println("a :" + a );
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a:" + a);
        return a *a;
    }
    void foo(){
        System.out.println("empty");
    }
    void foo(int a){
        a++;
        System.out.println(a);
    }
    char foo(char a, int b){
        return a-=b;
    }
    char toUppercase(char a){
        if(a>=97 && a<=122){
            return (a-=32);
         }
        else return a;
    }
    char[] toUppercase(char[] a){
        for (int i =0; i<a.length; i++){
           a[i] = toUppercase(a[i]);
           System.out.print(a[i]);
        }
        return a;
    }
    int overload(int a){
        return a;
    }
    short overload(short a){
        return a;
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(10);
        overload.test(1,5);
        overload.test(23.5);
        overload.foo();
        overload.foo(5);
        System.out.println(overload.foo('a', 32));
        System.out.println(overload.toUppercase('b'));
        char [] arr = {'a', 'j', 'k','T','6'};
        System.out.println(arr);
        overload.toUppercase(arr);
        System.out.println();
        System.out.println(overload.overload(2147483647));
        System.out.println(overload.overload(32766));
        Overload obj1 = new Overload(100, 22);
        Overload obj2 = new Overload(100, 22);
        Overload obj3 = new Overload(-1, -1);
        System.out.println("obj1 == obj2 " + obj1.equalTo(obj2));
        System.out.println("obj1 == obj3 " + obj1.equalTo(obj3));



    }
}
