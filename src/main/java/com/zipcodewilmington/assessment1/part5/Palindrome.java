package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int numOfPalindromes = 0;
        for (int i = 0; i < input.length(); i++){
            for (int j = i; j < input.length(); j++){
                if (input.charAt(i) == input.charAt(j)){
                    numOfPalindromes++;

                }
                else {
                    i++;
                }
                System.out.println(numOfPalindromes);
            }
        }

        return numOfPalindromes;

    }
}
