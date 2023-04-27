package com.bridgelabz;
/*
Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store
the prime numbers in a 2D Array, the first dimension represents the range 0-100,
100-200, and so on. While the second dimension represents the prime numbers in
that range
Extend the Prime Number Program and store only the numbers in that range that are
Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
Further store in a 2D Array the numbers that are Anagram and numbers that are not

123
231
321
312

 */

public class PrimeNumber {



    public static void main(String[] args) {

        int totalAnagarm=1*5+2*21+135*6;
        System.out.println(totalAnagarm);

       int num=1000;

        for (int i=1;i<=1000;i++){
            int count = 0;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }
}
