package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getListUsers();
    List<User> getUsersByCarParams(String carModel, int carSeries);
}
