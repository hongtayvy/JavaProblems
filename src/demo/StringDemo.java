package demo;

public class StringDemo {
    /**
     * This method takes the String "Hello, World" and chops it up to only return "Hello".
     */
    public static void runStringDemo(){
        //1. This is the base string.
        String helloWorld = "Hello, World";

        //2. We find the index of the comma. This will return an index of 5.
        int indexOfComma = helloWorld.indexOf(',');

        //3. We chop up the string with using the method of substring and indexOfComma. This means we create a new string UP TO the comma not with the comma.
        String hello = helloWorld.substring(indexOfComma);

        //Print result.
        System.out.println(hello);
    }
}
