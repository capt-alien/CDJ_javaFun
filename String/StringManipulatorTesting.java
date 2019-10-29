public class StringManipulatorTesting{
    public static void main(String[] args){
        // TEST TRIM AND CONCAT
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld
        // TEST GET INDEX OR NULL
        // StringManipulator manipulator = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator.getIndexOrNUll("Coding", letter);
        Integer b = manipulator.getIndexOrNUll("Hello World", letter);
        Integer c = manipulator.getIndexOrNUll("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        // TEST GET INDEX OR Null
        // StringManipulator manipulator = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        a = manipulator.getIndexOrNull(word, subString);
        b = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a); // 2
        System.out.println(b); // null
        // TEST CONCAT SUBSTRING
        // StringManipulator manipulator = new StringManipulator();
        word = manipulator.ConcatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld
    }

}
