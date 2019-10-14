package controller;

import service.UserService;
import service.UserServiceImpl;

public class UserController {
    private UserService userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void update(String title) {
        userService.update(title);
    }

    public void delete(int n) {
        userService.delete(n);
    }
}
