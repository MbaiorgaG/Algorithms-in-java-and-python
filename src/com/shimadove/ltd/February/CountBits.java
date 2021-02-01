package com.shimadove.ltd.February;

import java.util.Arrays;

public class CountBits {
    //Driver code
    public static void main(String[] args) {
        int number = 6;
        System.out.println(countBits(number));
    }

    private static int countBits(int number) {
        //base case
        if(number == 0){
            return 0;
        }
        int count = 0;
        while (number > 0){
            count += (number %2) & 1;
            number >>= 1;
        }
        return count;
    }
}
