package edu.ti.caih313.recursion.homeWork8;

public class LargestInt {

    public static void main(String[] args){
        int[] intArray = new int[] {2, 4, 7, 3, 5, 1, 5, 9, 1};
        System.out.println(findBiggest(intArray, 0, intArray.length -1));
    }

    private static int findBiggest(int[] intArray, int beggining, int end) {
        if (beggining == end) {
            return intArray[beggining];
        }else{
            int half = (beggining + end)/2;
            int frontHalf = findBiggest(intArray, beggining, half);
            int endHalf = findBiggest(intArray, half+1, end);
            if(frontHalf > endHalf){
                return frontHalf;
            }else{
                return endHalf;
            }
        }
    }
}