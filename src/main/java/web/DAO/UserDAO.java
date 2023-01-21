package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void addUser (User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUserById(long id);

    void update(long id, User user);
}
