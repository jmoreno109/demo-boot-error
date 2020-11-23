package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.error.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class AppController {

	@Autowired
	private UserService userService;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/show/{id}")
	public String show(Model model, @PathVariable Integer id) {

		User user = userService.getByIdOpt(id).orElseThrow(() -> new UserNotFoundException(id.toString()));

		model.addAttribute("user", user);
		return "show";
	}

}
