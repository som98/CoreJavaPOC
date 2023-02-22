package com.practice.som.java8.LambdaExpFuncInt;


interface MultiParamLambdaFunc {
    int sum(int a, int b, int c);
}

public class MultiParamLambdaFuncImpl {

    public static void main(String[] args) {

        MultiParamLambdaFunc mp= (a,b,c) ->  (a+b+c);        // One liner return type

        /*MultiParamLambdaFunc mp1= (a,b,c) -> {
            return a+b+c;                                    //  Multiple  liner return type for business logic
        };*/

        System.out.println("Sum : "+ mp.sum(30,40,50));
    }
}
