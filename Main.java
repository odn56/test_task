import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calc calc = new Calc();
        calc.a = "";
        calc.b = "";
        System.out.print("Введите выражение: ");
        calc.expression = in.nextLine();
        String stringA = calc.findA();
        String stringB = calc.findB();
        char action = calc.findAction();
        int a = 0;
        int b = 0;
        stringA=stringA.toUpperCase();
        stringB=stringB.toUpperCase();
        if (stringA.equals("I")) {
            a = 1;
        } else if (stringA.equals("II")) {
            a = 2;
        } else if (stringA.equals("III")) {
            a = 3;
        } else if (stringA.equals("IV")) {
            a = 4;
        } else if (stringA.equals("V")) {
            a = 5;
        } else if (stringA.equals("VI")) {
            a = 6;
        } else if (stringA.equals("VII")) {
            a = 7;
        } else if (stringA.equals("VIII")) {
            a = 8;
        } else if (stringA.equals("IX")) {
            a = 9;
        } else if (stringA.equals("X")) {
            a = 10;
        }

        if (stringB.equals("I")) {
            b = 1;
        } else if (stringB.equals("II")) {
            b = 2;
        } else if (stringB.equals("III")) {
            b = 3;
        } else if (stringB.equals("IV")) {
            b = 4;
        } else if (stringB.equals("V")) {
            b = 5;
        } else if (stringB.equals("VI")) {
            b = 6;
        } else if (stringB.equals("VII")) {
            b = 7;
        } else if (stringB.equals("VIII")) {
            b = 8;
        } else if (stringB.equals("IX")) {
            b = 9;
        } else if (stringB.equals("X")) {
            b = 10;
        }




      if (a>0 & b>0 & a<=10 & b<=10 ){
            if (action == '+'){
                System.out.print("Результат: ");
               int result = calc.addition(a,b);
                System.out.println(calc.numbersRome(result));
            }
            if (action == '-'){
                System.out.print("Результат: ");
                int result = calc.substraction(a,b);
                System.out.println(calc.numbersRome(result));
            }
            if (action == '*'){
                System.out.print("Результат: ");
                int result=calc.multiply(a,b);
                System.out.println(calc.numbersRome(result));
            }
            if (action == '/'){
                System.out.print("Результат: ");
                int result = calc.divide(a,b);
                System.out.println(calc.numbersRome(result));
            }
        }
        else{
            a=Integer.parseInt(stringA);
            b=Integer.parseInt(stringB);
          if (a > 0 & b > 0 & a <= 10 & b <= 10) {
              if (action == '+') {
                  System.out.print("Результат: ");
                  System.out.println(calc.addition(a, b));
              }
              if (action == '-') {
                  System.out.print("Результат: ");
                  System.out.println(calc.substraction(a, b));
              }
              if (action == '*') {
                  System.out.print("Результат: ");
                  System.out.println(calc.multiply(a, b));
              }
              if (action == '/') {
                  System.out.print("Результат: ");
                  System.out.println(calc.divide(a, b));
              }
          } else {
              System.out.println("Введено неверное выражение!");
          }
        }

        }
    }





class Calc {
    String a;
    String b;
    String expression;

    String numbersRome(int numberRome){
        if (numberRome<1){return "Ошибка т.к. в римской системе нет отрицательных чисел";}
        if (numberRome==1){return "I";}
        if (numberRome==2){return "II";}
        if (numberRome==3){return "III";}
        if (numberRome==4){return "IV";}
        if (numberRome==5){return "V";}
        if (numberRome==6){return "VI";}
        if (numberRome==7){return "VII";}
        if (numberRome==8){return "VIII";}
        if (numberRome==9){return "IX";}
        if (numberRome==10){return "X";}
        if (numberRome==11){return "XI";}
        if (numberRome==12){return "XII";}
        if (numberRome==13){return "XIII";}
        if (numberRome==14){return "XIV";}
        if (numberRome==15){return "XV";}
        if (numberRome==16){return "XVI";}
        if (numberRome==17){return "XVII";}
        if (numberRome==18){return "XVIII";}
        if (numberRome==19){return "XIX";}
        if (numberRome==20){return "XX";}
        if (numberRome==21){return "XXI";}
        if (numberRome==22){return "XXII";}
        if (numberRome==23){return "XXIII";}
        if (numberRome==24){return "XXIV";}
        if (numberRome==25){return "XXV";}
        if (numberRome==26){return "XXVI";}
        if (numberRome==27){return "XXVII";}
        if (numberRome==28){return "XXVIII";}
        if (numberRome==29){return "XXIX";}
        if (numberRome==30){return "XXX";}
        if (numberRome==31){return "XXXI";}
        if (numberRome==32){return "XXXII";}
        if (numberRome==33){return "XXXIII";}
        if (numberRome==34){return "XXXIV";}
        if (numberRome==35){return "XXXV";}
        if (numberRome==36){return "XXXVI";}
        if (numberRome==37){return "XXXVII";}
        if (numberRome==38){return "XXXVIII";}
        if (numberRome==39){return "XXXIX";}
        if (numberRome==40){return "XL";}
        if (numberRome==41){return "XLI";}
        if (numberRome==42){return "XLII";}
        if (numberRome==43){return "XLIII";}
        if (numberRome==44){return "XLIV";}
        if (numberRome==45){return "XLV";}
        if (numberRome==46){return "XLVI";}
        if (numberRome==47){return "XLVII";}
        if (numberRome==48){return "XLVIII";}
        if (numberRome==49){return "XLIX";}
        if (numberRome==50){return "L";}
        if (numberRome==51){return "LI";}
        if (numberRome==52){return "LII";}
        if (numberRome==53){return "LIII";}
        if (numberRome==54){return "LIV";}
        if (numberRome==55){return "LV";}
        if (numberRome==56){return "LVI";}
        if (numberRome==57){return "LVII";}
        if (numberRome==58){return "LVIII";}
        if (numberRome==59){return "LIX";}
        if (numberRome==60){return "LX";}
        if (numberRome==61){return "LXI";}
        if (numberRome==62){return "LXII";}
        if (numberRome==63){return "LXIII";}
        if (numberRome==64){return "LXIV";}
        if (numberRome==65){return "LXV";}
        if (numberRome==66){return "LXVI";}
        if (numberRome==67){return "LXVII";}
        if (numberRome==68){return "LXVIII";}
        if (numberRome==69){return "LXIX";}
        if (numberRome==70){return "LXX";}
        if (numberRome==71){return "LXXI";}
        if (numberRome==72){return "LXXII";}
        if (numberRome==73){return "LXXIII";}
        if (numberRome==74){return "LXXIV";}
        if (numberRome==75){return "LXXV";}
        if (numberRome==76){return "LXXVI";}
        if (numberRome==77){return "LXXVII";}
        if (numberRome==78){return "LXXVIII";}
        if (numberRome==79){return "LXXIX";}
        if (numberRome==80){return "LXXX";}
        if (numberRome==81){return "LXXXI";}
        if (numberRome==82){return "LXXXII";}
        if (numberRome==83){return "LXXXIII";}
        if (numberRome==84){return "LXXXIV";}
        if (numberRome==85){return "LXXXV";}
        if (numberRome==86){return "LXXXVI";}
        if (numberRome==87){return "LXXXVII";}
        if (numberRome==88){return "LXXXVIII";}
        if (numberRome==89){return "LXXXIX";}
        if (numberRome==90){return "XC";}
        if (numberRome==91){return "XCI";}
        if (numberRome==92){return "XCII";}
        if (numberRome==93){return "XCIII";}
        if (numberRome==94){return "XCIV";}
        if (numberRome==95){return "XCV";}
        if (numberRome==96){return "XCVI";}
        if (numberRome==97){return "XCVII";}
        if (numberRome==98){return "XCIII";}
        if (numberRome==99){return "XCIX";}
        if (numberRome==100){return "C";}



        return "Ошибка!";
    }
    int addition(int a, int b){
        int result = a+b;
        return result;

    }
    int substraction(int a, int b){
        int result = a-b;
        return result;

    }
    int multiply(int a, int b){
        int result = a*b;
        return result;

    }
    int divide(int a, int b){
        int result = a/b;
        return result;

    }

    String findA() {
        expression = expression.trim();
        int length = expression.length();
        char[] exp = expression.toCharArray();
        char action = ' ';
        int actionNumber = 0;

        for (int i = 0; i < length; i++) {
            if (exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/') {
                action = exp[i];
                actionNumber = i;
            }
            a = expression.substring(0, actionNumber);

        }
        return a;
    }
    String findB() {
        expression = expression.trim();
        int length = expression.length();
        char[] exp = expression.toCharArray();
        char action = ' ';
        int actionNumber = 0;

        for (int i = 0; i < length; i++) {
            if (exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/') {
                action = exp[i];
                actionNumber = i;
            }

            b = expression.substring(actionNumber + 1);
        }
        return b;
    }
    char findAction(){
        expression = expression.trim();
        int length = expression.length();
        char[] exp = expression.toCharArray();
        char action = ' ';
        int actionNumber = 0;

        for (int i = 0; i < length; i++) {
            if (exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/') {
                action = exp[i];
                actionNumber = i;
            }

            action= exp[actionNumber];
        }
        return action;
    }

}