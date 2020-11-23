package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> userList;

	public UserServiceImpl() {
		userList = Arrays.asList(new User(1, "pepe", "santos"), new User(2, "juan", "santos"),
				new User(3, "diego", "santos"));
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public User getById(Integer id) {
		return userList.stream().filter(x -> x.getId().equals(id)).findAny().orElse(null);

	}

	@Override
	public Optional<User> getByIdOpt(Integer id) {
		User user = getById(id);
		return Optional.ofNullable(user);
	}

}
