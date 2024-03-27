package web.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Component
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager em;
//    private EntityManagerFactory managerFactory;
//    @Autowired
//    public void setSessionFactory(LocalContainerEntityManagerFactoryBean managerFactoryBean) {
//        this.managerFactory = managerFactoryBean;
//    }

    @Override
    public List<User> allUser() {
        Query query = em.createQuery("from User");
        return query.getResultList();
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
