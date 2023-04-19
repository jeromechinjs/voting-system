package entity;
import adt.ArrayList;
import adt.ListInterface;
import entity.Voter;
import java.util.Scanner;
/**
 *
 * @author yewchun
 */
public class StudentRegistration {
    
   
    
    
    public static void main(String args[]) {
        
        ListInterface<Voter> voterList = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in); 
        
        boolean cont = true;
            
        do {
             System.out.print("Enter student id: ");
            String id = sc.nextLine();
        
        
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
        
            System.out.print("Enter student faculty: ");
            String faculty = sc.nextLine();
        
            System.out.print("Enter password: ");
            String password = sc.nextLine();
        
            Voter voter = new Voter(id, name, faculty, password);
        
            voterList.add(voter);
            
            System.out.print("Continue?: ");
            String yes = sc.nextLine();
            cont = "y".equals(yes);
            
        } while (cont);
       
        
        voterList.toString();
    }
}
