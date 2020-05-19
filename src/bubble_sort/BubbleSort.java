package bubble_sort;

import java.util.Scanner;

public class BubbleSort {
        public static void main(String[] args) {
            System.out.println("Please enter the size of array: ");
            int [] array= new int[numberVerification()];
            array=arrayFilling(array);
            System.out.print("Unsorted array: ");
            arrayOutput(array);
            array=bubbleSort(array);
            System.out.print("Sorted array: ");
            arrayOutput(array);
        }

        public static int numberVerification() {
            Scanner in = new Scanner(System.in);
            int numberFromUser=0;
            if (in.hasNextInt()) {
                numberFromUser=in.nextInt();
                if (numberFromUser<=0 ) {
                    System.out.println("Input number is '<' or '=' to zero");
                    numberVerification();
                }
            }else {
                System.out.println("Input value isn't integer type, please try again");
                numberVerification();
            }
            return numberFromUser;
        }

        static void arrayOutput(int [] array){
            for (int i:array) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        static int [] arrayFilling(int [] arr){
            System.out.println("Enter the Max value of the array");
            int arrayMaxNumber=numberVerification();
            for (int i = 0; i <arr.length ; i++) {
                arr[i]= (int)(Math.random()*arrayMaxNumber);
            }
            return arr;
        }

        static int [] bubbleSort(int[]array){
            int swapValue=0;
            for (int i = 0; i <array.length ; ++i) {
                for (int j = 0; j < array.length-(i+1); j++) {
                    if (array[j] > array[j + 1]) {
                        swapValue = array[j];
                        array[j] = array[j+1];
                        array[j+1]=swapValue;
                    }
                }
            }
            return array;
        }
    }
