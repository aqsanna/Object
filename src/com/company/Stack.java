package com.company;

public class Stack {
    int stck[];
    int tos;

    Stack(int n) {
        tos = -1;
        this.stck = new int[n];
    }

    void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("is full");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("is empty ");
            return 0;
        } else
            return stck[tos--];
    }

    public static void main(String[] args) {
//        int [] tiv={1,6,8,7,47};
        Stack stack = new Stack(2);
        stack.push(9);
        stack.push(15);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        stack.pop();


    }

}


