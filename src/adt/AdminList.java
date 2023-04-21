package adt;

public interface AdminList {
    void addAdmin(String newAdmin, String password);

    void removeAdmin(String adminToRemove);

    void displayAdminList();
}
