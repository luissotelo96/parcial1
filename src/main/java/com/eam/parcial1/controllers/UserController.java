package com.eam.parcial1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eam.parcial1.models.User;
import com.eam.parcial1.repositories.IUserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserRepository userRepository;

	@GetMapping("")
	public String showForm(User user) {
		return "createuserform";
	}

	@PostMapping("")
	public String saveUser(User user) {
		userRepository.save(user);
		return "redirect:/user";
	}

	@GetMapping("/list")
	public String getUsers(User user, Model model) {
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "users";
	}
}
