import java.util.ArrayList;

public class ExceptionsList {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i=0; i < myList.size(); i++){
            try{
                Integer catedValue = (Integer) myList.get(i);
                System.out.println(catedValue);
            } catch (Exception e){
                System.out.println("errored" + e);
                System.out.println("message: " + "Can not be made into an Int ");
                System.out.println("error Occurred at Index: "+i);
                System.out.println("Index Value: " +myList.get(i));
            }
            }


        // END MAIN
    }
}
