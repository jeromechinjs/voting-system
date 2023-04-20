package entity;
import adt.*;
/**
 *
 * @author Bryan Wong
 */
public class Results {
    private ArrayStack<Integer> teachers;
    
    
    public Results(){}

    public void printResults() {
        System.out.printf("Thank you for your paticipation in the voting of Teacher of The Year!\n" +
                           "Below are the results for The Teacher of The Year: ");

        for (int i = 0; i < teachers.getNumberOfEntries(); i++) {
            System.out.printf(i + ". " + teachers.pop() + "\n");
        }

    }
   
}
