package com.company;

public class MyArrayListClass {


    int count =0;
    int size =0;

    MyArrayListClass(int c, int s){
        this.count=c;
        this.size=s;
    }

 public boolean myAdd(int e){
     size = size +1;
     return true;
 }
}
