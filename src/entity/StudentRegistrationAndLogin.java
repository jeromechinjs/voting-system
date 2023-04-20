package entity;
import adt.ArrayList;
import adt.ListInterface;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author yewchun
 */
public class StudentRegistrationAndLogin {
    
   
    public static void main(String args[]) {
        
        ListInterface<Voter> voterList = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in); 
        
        boolean cont = true;
            
        
        do {
             System.out.print("Enter student id: ");
            String registerId = sc.nextLine();
        
        
            System.out.print("Enter student name: ");
            String registerName = sc.nextLine();
        
            System.out.print("Enter student faculty: ");
            String faculty = sc.nextLine();
        
            System.out.print("Enter password: ");
            String registerPassword = sc.nextLine();
        
            Voter voter = new Voter(registerId, registerName, faculty, registerPassword);
        
            voterList.add(voter);
            
            System.out.print("Continue?: ");
            String yes = sc.nextLine();
            cont = "y".equals(yes);
            
        } while (cont);
       
        // displaying info in array list
//        for (int i = 1; i <= voterList.getNumberOfEntries(); i++) {
//            System.out.print("ID: " + voterList.getEntry(i).getId() + "\nName: " + voterList.getEntry(i).getName() + "\nFaculty: " + voterList.getEntry(i).getFaculty());
//            
//        }
        
        boolean conti = true;
        do {
            System.out.println("Student Login");
        System.out.print("Enter student id: ");
            String id = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();
            
            
        // validation
        
        Iterator<Voter> iterator = voterList.getIterator();
        
        boolean loggedIn = false;
        while (iterator.hasNext()) {
            
            Voter voter = iterator.next();
            if (voter.getId().equals(id) && voter.getPassword().equals(password)) {
                System.out.print("Login Successfully\n");
                loggedIn = true;
                System.out.print("ID: " + voter.getId() + "\nName: " + voter.getName() + "\nFaculty: " + voter.getFaculty()+ "\n");
                conti = false;
                break;

            }
            
        }
        if (!loggedIn) {
                System.out.print("Student ID or Password is invalid\n");
                conti = true;
            }

        }while(conti);
        // login 
    }
}
