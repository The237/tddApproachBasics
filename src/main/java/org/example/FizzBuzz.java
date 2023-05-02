package org.example;

public class FizzBuzz {
    public String generate(int minNumber,int maxNumber) {
        return evaluateNumbers(minNumber, maxNumber);
    }

    private String evaluateNumbers(int minNumber, int maxNumber) {
        String result= "";
        while(minNumber <= maxNumber)
            result +=evaluateNumber(minNumber++);
        return result;
    }

    private String evaluateNumber(int number){
        if((number>100 || number<=0))
            return "OutOfLimits";
        if(number %15==0)
            return "FizzBuzz";
        if(number%3==0)
            return "Fizz";
        if(number%5==0)
            return "Buzz";
        return String.valueOf(number);
    }
}
