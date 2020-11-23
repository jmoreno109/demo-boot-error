package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {

	public List<User> getAll();

	public User getById(Integer id);

	public Optional<User> getByIdOpt(Integer id);

}
