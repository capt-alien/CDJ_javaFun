public class StringManipulatorTesting{
    // TEST TRIM AND CONCAT
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str); // HelloWorld

    // TEST GET INDEX OR NULL
    StringManipulator manipulator = new StringManipulator();
    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("Coding", letter);
    Integer b = manipulator.getIndexOrNull("Hello World", letter);
    Integer c = manipulator.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null

    // TEST GET INDEX OR Null
    StringManipulator manipulator = new StringManipulator();
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer a = manipulator.getIndexOrNull(word, subString);
    Integer b = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(a); // 2
    System.out.println(b); // null

    // TEST CONCAT SUBSTRING
    StringManipulator manipulator = new StringManipulator();
    String word = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(word); // eworld
    }
