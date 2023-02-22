package com.practice.som.java8.LambdaExpFuncInt;

/*          If Lambda Function is not used         */
public class CalculatorImplWithoutLambdaFunc implements Calculator{

    /*          If Lambda Function is not used         */

    @Override
    public void switchOn() {
        System.out.println("Switch On");
    }

    /*          If Lambda Function is not used         */

    public static void main(String[] args) {


        CalculatorImplWithoutLambdaFunc cal = new CalculatorImplWithoutLambdaFunc();
        cal.switchOn();

    }
}
