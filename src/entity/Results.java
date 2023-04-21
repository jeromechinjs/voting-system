package entity;
import adt.*;
import entity.*;

/**
 *
 * @author Bryan Wong
 */
public class Results {
    
    public Results(){}

    public void printResults() {
        System.out.printf("Thank you for your paticipation in the voting of Teacher of The Year!\n" +
                           "Below are the results for The Teacher of The Year: ");
        System.out.printf("%-3s %-15s %-15s", "No.", "Teacher", "Vote Count");
        for (int i = 0; i < teachers.getNumberOfEntries(); i++) {
            System.out.printf("%-2d %-15s %-2d\n", i+1, teachers.pop(), voteCount.pop());
        }

    }
   
}
