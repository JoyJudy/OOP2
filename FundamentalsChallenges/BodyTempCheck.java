package Class_Challenges.FundamentalsChallenges;

import java.util.*;
public class BodyTempCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your body temperature in Celsius: ");
        double reading = scanner.nextDouble();
        int temperatureCategory;


        if (reading < 36) {
            temperatureCategory = 1;
        }
        else if (reading <= 37.5) {
            temperatureCategory = 2;
        } else {
            temperatureCategory = 3;
        }

        switch (temperatureCategory) {
            case 1:
                System.out.println("Your body temperature is low. You are feeling cold.");
                break;
            case 2:
                System.out.println("Your body temperature is normal. You are healthy.");
                break;
            case 3:
                System.out.println("Your body temperature is high. You might be having a fever.");
                break;
        }
    }
}
