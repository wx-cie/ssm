package service;


import dao.UserDao;
import dao.UserDaoImpl;

import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements UserService {
 private UserDao userDao;

    @Override
    public void update(String title) {
    userDao.update(title);
    }

    @Override
    public void delete(int n) {
        userDao.delete(n);

    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao=userDao;
    }
}
