package Class_Challenges.FundamentalsChallenges;

import java.util.*;

class HelloTillStop {
    Scanner sc =  new Scanner(System.in);

    //outputs Hello while user wants to
    void showHello(){
        String choice; //guard variable

        System.out.print("For Hello type h, anything else to stop: ");
        choice = sc.next(); //set guard variable
        while ("h".equals(choice)) {
            System.out.println("Hello");
            choice = sc.next(); //update guard variable
        }

    }
    public static void main(String[] args){
        (new HelloTillStop()).showHello();
    }
}
