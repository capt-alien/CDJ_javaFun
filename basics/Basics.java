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


    // FIND MAX

    // GET ABVERAGE

    // Array with Odd Numbers

    // Greater Than Y

    // Square the values

    // ELIMINATE NEGIIVE

    // Max, Min, and Average

    // Shifting the Values in the Array

}
