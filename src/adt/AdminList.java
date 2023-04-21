package adt;

public interface AdminList {
    void addAdmin(AdminList newAdmin);

    void removeAdmin(AdminList adminToRemove);

    void displayAdminList();
}
