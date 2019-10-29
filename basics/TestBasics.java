public class TestBasics{
    public static void main(String[] args){
        Basics testbot = new Basics();
        // TEST: Print odds 1-Print255
        //should print 1-255

        testbot.Print255();

        // test Print odds to Print255
        //should print odd to 255

        testbot.PrintOdd255();

        //Test PRint sum()
        testbot.printsum();

        // TEST arrayItter
        int[] array = {1,3,5,7,9,13};
        testbot.arrayItter(array);

        // TEST FIND MAX
        int[] arr = {-3, -5, -7};
        System.out.println(testbot.findMax(arr));

        // TEST GET Average
        int[] avgArr= {2,10,3};
        System.out.println(testbot.findAvg(avgArr));

        // TEST ARR WITH ODD Numbers
        System.out.println(testbot.arrOfOdd());

        // TEST GREATER THAN Y
        int[] gtarr = {1, 3, 5, 7};
        System.out.println(testbot.greaterThanY(gtarr, 3));


        // TEST SQUARED Vals
        int[] sqvalarr = {1, 5, 10, -2};
        int[] squaredanswers= testbot.sqval(sqvalarr);
        for (int i=0; i< squaredanswers.length;i++){
            System.out.println(squaredanswers[i]);
        }

        // Test Eliminate negitives
        int[] withNeg = {1,5,10,-2};
        int[] noneg = testbot.noNeg(withNeg);
        for(int i=0; i< withNeg.length; i++){
            System.out.println(noneg[i]);
        }

        // TEST MAX MIN AVG
        int[] mmalist = {1,5,10,-2};
        int[] resultMMA = testbot.mma(mmalist);
        for(int i=0; i< resultMMA.length; i++){
            System.out.println(resultMMA[i]);
        }

        // TEST SHIFTY
        int[] shiftList = {1, 5, 10, 7, -2};
        int[] shiftyMcListFace = testbot.shifty(shiftList);
        for (int i=0; i < shiftyMcListFace.length; i++){
            System.out.println(shiftyMcListFace[i]);
        }


        // END
    }
}
