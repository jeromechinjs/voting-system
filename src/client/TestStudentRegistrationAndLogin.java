package client;
import java.util.Iterator;
import java.util.Scanner;
import entity.Voter;
/**
 *
 * @author yewchun
 */
public class TestStudentRegistrationAndLogin {
    
   
    public static void main(String args[]) {
        
       Voter voter = new Voter();
// ListInterface<Voter> voterList = new ArrayList<>();

        Scanner sc = new Scanner(System.in); 
        
        boolean cont = true;
            
        
        do {
             System.out.print("Enter student id: ");
            String registerId = sc.nextLine();
        
        
            System.out.print("\nEnter student name: ");
            String registerName = sc.nextLine();
        
            System.out.print("\nEnter student faculty: ");
            String faculty = sc.nextLine();
        
            System.out.print("\nEnter password: ");
            String registerPassword = sc.nextLine();
        
            Voter voterInfo = new Voter(registerId, registerName, faculty, registerPassword);
            
            voter.addVoter(voterInfo);

            //voterList.add(voter);
            
            System.out.print("Continue?: ");
            String yes = sc.nextLine();
            cont = "y".equals(yes);
            
        } while (cont);
        
        //voter.displayArrayList();
       
        
        boolean conti = true;
        do {
            System.out.println("\nStudent Login\n");
            System.out.print("Enter student id: ");
            String id = sc.nextLine();

            System.out.print("\nEnter password: ");
            String password = sc.nextLine();
            
            
            // validation
        
            Iterator<Voter> iterator = voter.getVoterList().getIterator();
        
            boolean loggedIn = false;
            while (iterator.hasNext()) {
            
                Voter voterIt = iterator.next();
                if (voterIt.getId().equals(id) && voterIt.getPassword().equals(password)) {
                    System.out.print("\nLogin Successfully\n");
                    loggedIn = true;
                    //System.out.print("ID: " + voterIt.getId() + "\nName: " + voterIt.getName() + "\nFaculty: " + voterIt.getFaculty()+ "\n");
                    conti = false;
                    break;
                }
            }
            if (!loggedIn) {
                System.out.print("\nStudent ID or Password is invalid\n");
                conti = true;
            }

        }while(conti);

    }
}
