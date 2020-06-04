package com.testexampletestreference;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        double b = 40;
        int c = 20;
        String name = new String("Tomek");
        String name3 = new String ("Tomek");

        if (name3.equals(name)){
            System.out.println("These names are equals");
        }





        Test test1 = new Test();
        a = test1.changeValue(a);
        System.out.println(a);
        Foo foo = new Foo();
        test1.changeValueTwo(foo);
        System.out.println(foo.y);
        String name1 = "Tomek";
        String name2 = test1.changeName(name1);
        System.out.println(name2);
        b = test1.changeValueD(b);
        System.out.println(b);
        c = test1.changeValue(c);
        System.out.println(c);

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

    double changeValueD(double chVD){
        chVD = chVD + 4;
        return chVD;
    }
}

class Foo{
    int y = 20;
}

class Example{
    double v = 3.4;
}


