package entity;

/**
 *
 * @author yewchun
 */
import adt.ArrayList;
import adt.ListInterface;

public class Voter {
    private final ListInterface<Voter> voterList = new ArrayList<>();
    private final ListInterface<Voter> votedVoterList = new ArrayList<>();
    private String id;
     private String name;
     private String faculty;
     private String password;

    public Voter(String id, String name, String faculty, String password) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.password = password;
    }

    public Voter() {
    }

    public String getId() {
        return id;
    }

    public ListInterface<Voter> getVoterList() {
        return voterList;
    }

    public ListInterface<Voter> getVotedVoterList() {
        return votedVoterList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addVoter(Voter voterInfo) {
        voterList.add(voterInfo);
    }
    public void addVotedVoter(Voter votedVoterInfo) {
        voterList.add(votedVoterInfo);
    }
    
    public void displayArrayList() {
        for (int i = 1; i <= voterList.getNumberOfEntries(); i++) {
            System.out.print("ID: " + voterList.getEntry(i).getId() + "\nName: " + voterList.getEntry(i).getName() + "\nFaculty: " + voterList.getEntry(i).getFaculty());
        }
    }
}