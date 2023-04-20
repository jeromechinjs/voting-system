package entity;
import adt.*;

public class Results {
    private ArrayStack<Integer> teachers;

    public Results(){}

    public void printResults() {
        System.out.printf("Thank you for your paticipation in the voting of Teacher of The Year!\n" +
                           "Below are the results for The Teacher of The Year: ");

        System.out.printf("1. " + teachers.pop());

    }
   
}
