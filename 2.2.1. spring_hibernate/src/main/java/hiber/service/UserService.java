package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUser(String model,int series);

    User getUserByCarModelAndSeries(String model, int series);
}
