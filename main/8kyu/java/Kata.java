//Given an array of integers.
//
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
//
//If the input array is empty or null, return an empty array:
//
//C#/Java: new int[] {} / new int[0];
//C++: std::vector<int>();
//JavaScript/CoffeeScript/TypeScript/PHP/Haskell: [];
//Rust: Vec::<i32>::new();
//
//ATTENTION!
//
//The passed array should NOT be changed. Read more here.
//
//For example:
//
//input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}
//return int[] {10, -65}.



public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {

        int countPos = 0;
        int sumNeg = 0;
        int[] tab = new int[2];

        if (input == null || input.length == 0){
            return new int[0];
        }

        for (int i = 0; i < input.length; i++){
            if (input[i] > 0){
                countPos += 1;
            } else if (input[i] < 0) {
                sumNeg += input[i];
            }
        }
        tab[0] = countPos;
        tab[1] = sumNeg;
        return tab;
    }
}
