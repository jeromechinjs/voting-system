package entity;

import adt.*;

/**
 *
 * @author Bryan Wong
 */
public class Results {
    private StackInterface<String> teachers = new ArrayStack<>();
    private StackInterface<Integer> voteCount = new ArrayStack<>();

    public Results(StackInterface<String> teachers, StackInterface<Integer> voteCount) {
        this.teachers = teachers;
        this.voteCount = voteCount;
    }

    public StackInterface<VoteResultDataPair> sortDescending(ArrayQueue<VoteResultDataPair> voteResults) {
        StackInterface<Integer> tempStack = new ArrayStack<>();      //temporary stack for sorting
        StackInterface<String> tempStack2 = new ArrayStack<>();

        while(!voteResults.isEmpty()) {
            voteCount.push(voteResults.getFront().getVoteCount());
            teachers.push(voteResults.getFront().getCandidateName());
            voteResults.dequeue();
        }

        while (!voteCount.isEmpty() && !teachers.isEmpty()) {         //Sort until aStack is empty
            int temp = voteCount.pop();
            String tempS = teachers.pop(); 

            while (!tempStack.isEmpty() && !tempStack2.isEmpty() && tempStack.peek() < temp) {   //if tempStack is not empty AND tempStack's top element is larger than aStack's top element,
                voteCount.push(tempStack.pop()); 
                teachers.push(tempStack2.pop());                          //push tempStack's top element into aStack
            }
            voteCount.push(temp);
            teachers.push(tempS);
        }
        
        StackInterface<VoteResultDataPair> sortedStack = new ArrayStack<>();
        while (!voteCount.isEmpty() && !teachers.isEmpty()){
            sortedStack.push(new VoteResultDataPair(teachers.pop(), voteCount.pop()));
        }
        return sortedStack;       //Sorted Stack
    }

    public void printResults(ArrayQueue<VoteResultDataPair> voteResults) {
        StackInterface<VoteResultDataPair> sortedStack = new ArrayStack<>();
        sortedStack = sortDescending(voteResults);

        System.out.printf("Thank you for your paticipation in the voting of Teacher of The Year!\n" +
                           "Below are the results for The Teacher of The Year: ");
        System.out.printf("%-4s %-15s %-15s", "No.", "Teacher", "Vote Count");
        for (int i = 0; i < (teachers.getNumberOfEntries()-1); i++) {
            System.out.printf("%-2d %-15s %-2d\n", i+2, sortedStack.pop().getCandidateName(), sortedStack.pop().getVoteCount());
        }
        System.out.printf("\n...And The Teacher of The Year is " + sortedStack.pop().getCandidateName() + "!!!!");

    }
   
}
