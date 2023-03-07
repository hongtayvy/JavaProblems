package basics.demo;

public class StoreDataDemo {
    public static void runStoreDataDemo(){
        String victorFullName = "Victor Hongtay Yang";

        //I get the index of the first space and the last space here.
        int firstSpace = victorFullName.indexOf(" ");
        int lastSpace = victorFullName.lastIndexOf(" ");

        //I create split up my full name into their respective parts.
        String victorFirstName = victorFullName.substring(0, firstSpace);
        String victorMiddleName = victorFullName.substring(firstSpace + 1, lastSpace);
        String victorLastName = victorFullName.substring(lastSpace + 1, victorFullName.length());

        //I create an array that will hold my split array
        String [] victorFullNameSplit = new String[3];

        //Since I need to access the individual slots of the array I need to use a for loop. I then store the names inside of those slots from 0 to 2.
        for(int i = 0; i < victorFullNameSplit.length; i++) {
            switch (i) {
                case 0:
                    victorFullNameSplit[i] = victorFirstName;
                    break;
                case 1:
                    victorFullNameSplit[i] = victorMiddleName;
                    break;
                case 2:
                    victorFullNameSplit[i] = victorLastName;
                    break;
            }
            System.out.println("Name inserted is: " + victorFullNameSplit[i]);
        }
    }
}
