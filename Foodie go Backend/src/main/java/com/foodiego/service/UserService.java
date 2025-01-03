package com.foodiego.service;

import java.util.List;
import java.util.Optional;

import com.foodiego.entity.User;




public interface UserService {
	User saveUser(User user);
     User loginUser(User user);
	User updateUser(User user, long userId);
	User getUserById(long userId);
	List<User> getAllUser();
	User getUserByEmail(User user);
	void deleteUser(long userId);

}
