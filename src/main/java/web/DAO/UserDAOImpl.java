package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public User getUserById(long id) {
        TypedQuery<User> query = entityManager.createQuery("select u from User u where id = :id", User.class)
                .setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void deleteUserById(long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public void update(long id, User updatedUser) {
       User user = getUserById(id);
        user.setName(user.getName());
        user.setSurname(user.getSurname());
        user.setAge(user.getAge());
        user.setEmail(user.getEmail());
    }
}
