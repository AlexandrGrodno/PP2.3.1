package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.UserDAO;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImp implements UserService {
    private UserDAO userDAO;
    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User getIdUser(int id) {
        return userDAO.getIdUser(id);
    }

    @Override
    public List<User> allUser() {
        return userDAO.allUser();
    }
}
