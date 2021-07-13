package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        ex10();
    }
    public static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = scanner.nextInt();
        if(a%2 == 0 && a != 0){
            System.out.println("а - чётное");
        }else if(a == 0){
            System.out.println("а = 0");//спорный момент - 0 чётное или нет, сложно сказать
        }else {
            System.out.println("а - нечётное");
        }
    }
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = scanner.nextInt();
        if(a%3 == 0){
            System.out.println(a + " кратно 3");
        }
        if(a%5 == 0){
            System.out.println(a + " кратно 5");
        }
        if(a%7 == 0){
            System.out.println(a + " кратно 7");
        }
        if(a%3 != 0 && a%5 != 0 && a%7 != 0) {
            System.out.println(a + " He кратно 3 5 7");
        }
    }
    public static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое число:");
        float a = scanner.nextFloat();
        System.out.println("Введите делитель:");
        float b = scanner.nextFloat();
        if(Float.isNaN(a) || Float.isNaN(b)){
            System.out.println("Error! не является числом");
        }else if(b == 0){
            System.out.println("Error! 0 в знаменателе");
        }else {
            System.out.println("Частное = " + a/b);
        }
    }
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("В каком году была основана Одесса?:");
        int year = scanner.nextInt();
        if(year == 1794){
            System.out.println("Сектор приз на барабане!");
        }else{
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году");
        }
    }
    public static void ex5(){
       /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки:");
        int year = scanner.nextInt();
        if(year%4==0){
            if(year%400)*/
    }
    public static void ex6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость покупки:");
        float bill = scanner.nextFloat();
        if(bill >= 500 && bill < 1000){
            float newBill = bill - bill*3/100;
            System.out.println("Вам предоставляется скидка 3%\n" + "Сумма с учетом скидки:" + newBill + "грн");
        }else if(bill >= 1000){
            float newBill = bill - bill*5/100;
            System.out.println("Вам предоставляется скидка 5%\n" + "Сумма с учетом скидки:" + newBill + "грн");
        } else{
            System.out.println("Вам не предоставляется скидка");
        }
    }
    public static void ex7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисление стоимости разговора по телефону.\n" +
                "Введите исходные данные:\n" +
                "Длительность разговора (целое количество минут)\n");
        int timeOfConv = scanner.nextInt();
        int bill = timeOfConv*2;
        System.out.println("День недели (1 — понедельник, ... 7 — воскресенье)");
        int day = scanner.nextInt();
        switch(day){
            case 1,2,3,4,5:
                System.out.println("Вам не предоставляется скидка\n Общая стоимость " + bill + "грн.");
                break;
            case 6,7:
                System.out.println("Вам предоставляется скидка 20%.\n" +
                        "Общая стоимость разговора:"+ (float) bill/5 + "грн.");
                break;
            default:
                System.out.println("error!");
        }
    }
    public static void ex8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число:");
        int a = scanner.nextInt();
        int hund = a/100;
        int dec = a/10;
        int un = a%10;
        //a)
        if(hund > un){
            System.out.println("Первая цифра больше последней");
        } else if(hund == un){
            System.out.println("Первая цифра равна последней");
        }else{
            System.out.println("Первая цифра меньше последней");
        }
        //b
        if(hund > dec){
            System.out.println("Первая цифра больше второй");
        } else if(hund == dec){
            System.out.println("Вторая цифра равна первой");
        }else{
            System.out.println("Вторая цифра меньше первой");
        }
        //c
        if(dec > un){
            System.out.println("Вторая цифра больше последней");
        } else if(dec == un){
            System.out.println("Вторая цифра равна последней");
        }else{
            System.out.println("Вторая цифра меньше последней");
        }
    }
    public static void ex9(){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 9999:");
        int a = scanner.nextInt();
        int thous = a/1000;
        int hund = a/100;
        int dec = a/10;
        int un = a%10;
        switch(thous){
            case 1:
                System.out.println("");
        }*/
    }
    public static void ex10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        float x = scanner.nextFloat();
        System.out.println("Введите  другое число:");
        float y = scanner.nextFloat();
        y = (x>y)?(x+y)/2 : 2*x*y;
        x = (y>x)?(x+y)/2 : 2*x*y;
        System.out.println("y = " + y );
        System.out.println("x = " + x );
    }
}
