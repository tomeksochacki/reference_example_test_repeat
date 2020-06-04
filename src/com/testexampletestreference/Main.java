package com.testexampletestreference;

public class Main {
    public static void main(String[] args) {
        int a = 20;

        Test test1 = new Test();
        a = test1.changeValue(a);
        System.out.println(a);
        Foo foo = new Foo();
        test1.changeValueTwo(foo);
        System.out.println(foo.y);
        String name1 = "Tomek";
        String name2 = test1.changeName(name1);
        System.out.println(name2);
    }
}

class Test{

    int changeValue(int chV){
        chV = chV + 2;
        return chV;
    }

    void changeValueTwo(Foo chV){
        chV.y = chV.y + 40;
    }

    String changeName(String name){
        name = name + " Sochacki";
        return name;
    }
}

class Foo{
    int y = 20;
}


