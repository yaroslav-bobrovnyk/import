package lambda_hw;

import java.util.Arrays;

public class Lambda{
    public static void main(String[] args) {
        String [] arr={"Vasyl","Anton","Yaroslav","Igor","Vladislav","Yin"};
        System.out.println("Original array: "+ Arrays.toString(arr));
        sorting(arr,(String[] array,int i,int j)->array[j].length()> array[j + 1].length());
        System.out.println("Sorting from short to long: "+Arrays.toString(arr));
        sorting(arr,(String[] array,int i,int j)->array[j].length()< array[j + 1].length());
        System.out.println("Sorting from long to short: "+Arrays.toString(arr));
        sorting(arr,(String[] array,int i,int j)->array[j].charAt(0)>array[j+1].charAt(0));
        System.out.println("Sorting by alphabet: "+Arrays.toString(arr));
        sorting(arr,(String[] array,int i,int j)->!array[j].toLowerCase().contains("a"));
        System.out.println("String that contanins 'a': "+Arrays.toString(arr));
    }

    private static void sorting(String [] array, Check check){
        String swapValue=null;
        for (int i = 0; i <array.length ; ++i) {
            for (int j = 0; j < array.length-(i+1); j++) {
                if (check.check(array,i,j)) {
                    swapValue = array[j];
                    array[j] = array[j+1];
                    array[j+1]=swapValue;
                }
            }
        }
    }
}
interface Check{
    boolean check(String[] arr,int i,int j);
}

