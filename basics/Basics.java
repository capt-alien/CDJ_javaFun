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
    public static ArrayList<Integer> greaterThanY(int[] arr, int y){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i= 0; i< arr.length; i++){
            if(arr[i]>y){
                lista.add(arr[i]);
            }
        }
        return lista;
    }

    // Square the values\
    public static int[] sqval(int[] arr){
        int[] rtnArr;
        rtnArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rtnArr[i]=arr[i]*arr[i];
        }
        return rtnArr;
    }

    // ELIMINATE NEGIIVE
    public static int[] noNeg(int[] arr){
        int[] nonegarr;
        nonegarr = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            if (arr[i] > 0){
                nonegarr[i] = arr[i];
            } else{
                nonegarr[i] = 0;
            }
        }
        return nonegarr;
    }

    // Max, Min, and Average
    public static int[] mma(int[] arr){
        int total = arr[0];
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            total += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i]< min){
                min = arr[i];
            }
        }
        int[] returner = {max, min, total/arr.length};
        return returner;
    }

    // Shifting the Values in the Array
    public static int[] shifty(int[] arr){
        int[] mcShiftFace;
        mcShiftFace = new int[arr.length];
        for(int i=0; i < arr.length-1; i++ ){
            mcShiftFace[i] = arr[i+1];
        }
        mcShiftFace[arr.length-1] = 0;
        return mcShiftFace;
    }


}
