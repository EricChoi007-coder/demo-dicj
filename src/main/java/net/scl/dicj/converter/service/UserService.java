package net.scl.dicj.converter.service;

import net.scl.dicj.converter.domain.User;

import java.util.List;

public interface UserService {

    String login(String username, String pwd);


    List<User> listUser();

    User findByUserId(String name);

}
