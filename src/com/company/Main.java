package com.company;

public class Main {

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;

        char opCode = 'z';

        if(opCode == 'a')
            result = value1 + value2;
        else if(opCode == 's')
            result = value2 - value1;
        else if(opCode == 'm')
            result = value1 * value2;
        else if(opCode == 'd')
            result = value1/value2;
        else
            result = 0.0d;
        System.out.println(result);
    }
}
