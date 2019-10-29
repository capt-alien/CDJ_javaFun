import java.util.ArrayList;

public class Basics{
    // print 1-255
    public static void Print255(){
        for (int i = 0; i <= 255; i++){
            System.out.println(i);
        }
    }
    // Print odds 1-Print255
    public static void PrintOdd255(){
        for (int i = 1; i <= 255; i=i+2){
            System.out.println(i);
        }
    }
    // print sum
    public static void printsum(){
        int tots = 0;
        for (int i=1; i<=255; i++){
            tots += i;
            String string1 = String.format("New Number: %d Sum: %d", i, tots);
            System.out.println(string1);
        }
    }
    // ITTERATING THROUGH AN ARRAY
    public static void arrayItter(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    // FIND MAX
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i=1; i < arr.length; i++){
            if (arr[i]< max){
                max = arr[i];
            }
        }
        return max;
    }

    // GET ABVERAGE
    public static int findAvg(int[] arr){
        int total = 0;
        for (int i = 0; i< arr.length; i++){
            total += arr[i];
        }
        return total/arr.length;
    }

    // Array with Odd Numbers
    public static ArrayList<Integer> arrOfOdd(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i= i+2){
            arr.add(i);
        }
        return arr;
    }

    // Greater Than Y

    // Square the values

    // ELIMINATE NEGIIVE

    // Max, Min, and Average

    // Shifting the Values in the Array

}
