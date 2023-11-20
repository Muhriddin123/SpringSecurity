package ru.itmentor.spring.boot_security.demo.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;
@Repository
public interface UserDao {
    List<User> getUsers();

    void saveUser(User user);
    void updateUser(User user);
    User getUser(Long id);

    void deleteUser(Long id);

}
