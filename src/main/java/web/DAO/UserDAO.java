package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUser();
    void addUser();
    void deleteUser(int id);
    void editUser();
    User getIdUser(int id);

    void save(User user);
}
