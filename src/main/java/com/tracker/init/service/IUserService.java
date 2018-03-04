package com.tracker.init.service;

import com.tracker.init.model.User;

public interface IUserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
