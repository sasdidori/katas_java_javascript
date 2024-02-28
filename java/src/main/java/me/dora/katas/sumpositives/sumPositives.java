package me.dora.katas.sumpositives;

import java.util.Arrays;

//array of numbers -> return only the sum of the positive ones
// if array [] -> sum = 0
// go through all the numbers and check one by one -> is it positive
// when it is positive -> put it in another array/box
// go to the next
// when it is negative -> don't do anything
//if there is no number left in the box anymore -> look at the new box and say all the numbers out loud
public class sumPositives {

    public int sum(int[] arr){
        if(arr.length < 1) {
            return 0;
        }
        return Arrays.stream(arr).filter(a -> a >= 0)
                .sum();
    }
}
