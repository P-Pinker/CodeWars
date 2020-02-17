package kyu7;//Simply find the closest value to zero from the list. Notice that there are negatives in the list.
//
//List is always not empty and contains only integers. Return None if it is not possible to define only one of such values. And of course, we are expecting 0 as closest value to zero.
//
//Examples:
//
//[2, 4, -1, -3]  => -1
//[5, 2, -2]      => None
//[5, 2, 2]       => 2
//[13, 0, -6]     => 0


public class ClosestToZero {

    public static Integer find(int[] arr) {

        int num = Math.abs(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) < num){
                num = arr[i];
            } else if (Math.abs(arr[i]) == Math.abs(num)) {
                return null;
            }
        }
        return num;
    }
}