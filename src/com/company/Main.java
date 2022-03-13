package com.company;

public class Main {

    public static void main(String[] args) {

        double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char [] opCode = {'d', 'a', 's', 'm'};
        double[] results = new double[opCode.length];

        for(int i = 0; i < opCode.length; i++) {
            results[i] = execute(leftVals[i], rightVals[i],opCode[i]);
        }
            for(double allResults : results)
            System.out.println(allResults);

    }

    static double execute (double leftVal, double rightVal, char opCode){
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid OpCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }
}