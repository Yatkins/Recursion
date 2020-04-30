package edu.ti.caih313.recursion.sort;

/**
 * Class for sorting an array of integers from smallest to largest
 * using the merge sort algorithm.
 */
public class MergeSort {

    private  static long numberOfCopies = 0;
    /**
     * Precondition: Every indexed variable of the array a has a value.
     * Postcondition: a[0] <= a[1] <= ... <= a[a.length - 1].
     */

    public long getNumberOfCopies(){
        return numberOfCopies;
    }
    public static void sort(int[] a, String prefix) {
        System.out.println(prefix + "Calling sort on array with length " + a.length);
        //if a.length == 1, a is sorted.
        if (a.length >= 2) {
            int halfLength = a.length / 2;
            int[] firstHalf = new int[halfLength];
            int[] lastHalf = new int[a.length - halfLength];
            System.out.println(prefix + "passing argument to divide with length " + a.length);
            divide(a, firstHalf, lastHalf, "-"+prefix);
            System.out.println(prefix + "passing argument to sort with length " + a.length);
            sort(firstHalf, "-"+prefix);
            System.out.println(prefix + "passing argument to sort with length " + a.length);
            sort(lastHalf, "-"+prefix);
            System.out.println(prefix + "passing argument to merge with length " + a.length);
            merge(a, firstHalf, lastHalf, "-"+prefix);
        }
        System.out.println(prefix + "Exiting sort at array of length " + a.length);
    }

    //Precondition: a.length = firstHalf.length + lastHalf.length.
    //Postcondition: All the elements of a are divided
    //between the arrays firstHalf and lastHalf.
    private static void divide(int[] a, int[] firstHalf,
                               int[] lastHalf, String prefix) {
        System.out.println(prefix + "Calling divide on array of length " + a.length);
        System.out.println(prefix + "There are " + firstHalf.length + " elements in firstHalf");
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = a[i];
            numberOfCopies++;
        }System.out.println(prefix + "There are " + lastHalf.length + " elements in firstHalf");
        for (int i = 0; i < lastHalf.length; i++) {
            lastHalf[i] = a[firstHalf.length + i];
            numberOfCopies++;
        } System.out.println(prefix + "Exiting divide at array of length " + a.length);
    }

    //Precondition: Arrays firstHalf and lastHalf are sorted from
    //smallest to largest; a.length = firstHalf.length +
    //lastHalf.length.
    //Postcondition: Array a contains all the values from firstHalf
    //and lastHalf and is sorted from smallest to largest.
    private static void merge(int[] a, int[] firstHalf,
                              int[] lastHalf, String prefix) {
        System.out.println(prefix + "Calling merge on array at length " + a.length);
        int firstHalfIndex = 0, lastHalfIndex = 0, aIndex = 0;
        while ((firstHalfIndex < firstHalf.length) &&
                (lastHalfIndex < lastHalf.length)) {
            if (firstHalf[firstHalfIndex] < lastHalf[lastHalfIndex]) {
                a[aIndex] = firstHalf[firstHalfIndex];
                firstHalfIndex++;
                numberOfCopies++;
            } else {
                a[aIndex] = lastHalf[lastHalfIndex];
                lastHalfIndex++;
                numberOfCopies++;
            }
            aIndex++;
        }System.out.println(prefix + aIndex + " numbers were merged");
        //At least one of firstHalf and lastHalf has been
        //completely copied to a.
        //Copy rest of firstHalf, if any.
        if(firstHalfIndex < firstHalf.length){
            System.out.println(prefix + (firstHalf.length-firstHalfIndex) + " numbers were appended.");
        }else if(lastHalfIndex < lastHalf.length){
            System.out.println(prefix + (lastHalf.length-lastHalfIndex) + " numbers were appended.");
        }

        while (firstHalfIndex < firstHalf.length) {
            a[aIndex] = firstHalf[firstHalfIndex];
            aIndex++;
            firstHalfIndex++;
            numberOfCopies++;
        }
        //Copy rest of lastHalf, if any.
        while (lastHalfIndex < lastHalf.length) {
            a[aIndex] = lastHalf[lastHalfIndex];
            aIndex++;
            lastHalfIndex++;
            numberOfCopies++;
        }
        System.out.println(prefix + "Exiting merge at array of length " + a.length);
    }
}