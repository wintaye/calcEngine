package com.company;

public class Main {

    public static void main(String[] args) {

        double [] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double [] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char [] opCode = {'d', 'a', 's', 'm'};
        double[] results = new double[opCode.length];

        for(int i = 0; i < opCode.length; i++) {
            switch (opCode[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid OpCode: " + opCode[i]);
                    results[i] = 0.0d;
                    break;
            }
        }
            for(double allResults : results)
            System.out.println(allResults);

    }
}
