package Class_Challenges.ArrayChallenges;

import java.util.Random; //imports the Random library

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random(); //create an instance 'random' from the built-in random class in the library
        String[] orderIDs = new String[5]; //length of the array is 5

        for (int i = 0; i < orderIDs.length; i++) {
            //Generate a random uppercase letter between A(65) and E(69)
            char prefix =(char)(random.nextInt(5)+ 'A');

            //Generate a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999) +1;
            String suffix = String. format("%03d", number); //formats the number as a 3-digit string, adding leading zeros if necessary

            //Combine prefix and suffix to form the OrderID
            orderIDs[i] = prefix + suffix;
        }

        //Print all generated OrderIDs
        for(String orderID : orderIDs){
            System.out.println(orderID);
        }
    }
}
