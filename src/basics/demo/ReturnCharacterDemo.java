package basics.demo;

public class ReturnCharacterDemo {

    public static void runReturnCharacterDemo(){
        String helloWorld = "Hello, \n World";
        int indexOfReturnCharacter = helloWorld.indexOf("\n");
        String subStringHello = helloWorld.substring(0, indexOfReturnCharacter);
        System.out.println(subStringHello);
    }
}
