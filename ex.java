import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ex{

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phonebook = new HashMap<String, ArrayList<Integer>>();
          
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number (1 - added contact 2 - Print all contacts 3 - Exit): ");
        int num = scan.nextInt();

        while(num != 3){
       
            if(num == 1){
                System.out.println("Input a name of contact: ");
                String key = scan.next();
                System.out.println("Input a phone number: ");
                Integer value = scan.nextInt();

                // scan.nextLine();

                addContact(key, value, phonebook);

            }
            else if(num == 2){
                System.out.println(phonebook);

            }
            
            System.out.print("Input a number (1 - added contact 2 - Print all contacts 3 - Exit): ");
            num = scan.nextInt();
            scan.nextLine();

        }
        scan.close();
    }

    public static void addContact(String key, Integer value, HashMap<String, ArrayList<Integer>> phonebook) {

    
        if (phonebook.containsKey(key)) {

            ArrayList<Integer> phNumber = new ArrayList<>();
            phNumber = phonebook.get(key);
            phNumber.add(value);
            Collections.sort(phNumber);
        } 
        else {
            ArrayList<Integer> phNumber = new ArrayList<>();
            phNumber.add(value);
            phonebook.put(key, phNumber);
        }
    }

}