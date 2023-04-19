package entity;

/**
 *
 * @author yewchun
 */
public class Voter {
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

    public String getId() {
        return id;
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

   
}

