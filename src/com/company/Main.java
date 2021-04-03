package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println(methodOne(24, 18));
        System.out.println(myPlan( 19,20));
        System.out.println(myMethod(43,50));
        System.out.println(myMethod2(12,34));
        myMethod3(25,26);
        myMethod3(55,34);
        myMethod3(34,68);

    }

    public static String methodOne(int age, int temperature) {
        return "age:" + age + " " + " temperature:" + " " + temperature;
    }

    public static String myPlan(int age, int temperature) {
        if (age > 20 && age < 40 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature == 0 || temperature < 27) {
            return "Можно идти гулять №2";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять №3";
        } else
            return "Оставатесь дома";
    }
    public static int myMethod (int oneNumber, int twoNumber){
        return oneNumber + twoNumber;
    }
    public static int myMethod2 (int x , int c){
        return x *c;
    }
    public static void myMethod3 (int s, int p){
        System.out.println("результат:" +(s + p) );
    }
}

