package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUser();
    void addUser();
    void deleteUser();
    void editUser();
}
