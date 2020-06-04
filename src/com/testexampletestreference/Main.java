package com.testexampletestreference;

public class Main {
    public static void main(String[] args) {
        int a = 53;
        int b = a;

        b = 30;

        System.out.println(a);

        Test x = new Test();
        Test y = x;

        y.a = 40;

        System.out.println(y.a);

        String imie = "Tomek";
        String imie2 = imie;

        //imie2 = "Tom";
        System.out.println(imie2);;
    }
}

class Test{

    int a = 20;
}


