package jbr.springmvc.dao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

/* Apollo test interface for accessing PostgreSQL */

public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
