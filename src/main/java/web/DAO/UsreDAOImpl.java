package web.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import web.model.User;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public class UsreDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(LocalContainerEntityManagerFactoryBean sessionFactory) {
        this.sessionFactory = (SessionFactory) sessionFactory;
    }

    @Override
    public List<User> allUser() {
        return null;
    }

    @Override
    public void addUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void editUser() {

    }
}
