package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.User;
import com.example.demo.services.UserService;

@Controller
public class SignInSignUpController {
	
	@Autowired UserService userService;
	
	@GetMapping("/login")
	public ModelAndView showFormLogin() {
		return new ModelAndView("login", "userLogin", new User());
	}
	
	@GetMapping("/register")
	public ModelAndView showFormRegister() {
		return new ModelAndView("register", "userRegister", new User());
	}
	
	@PostMapping("/register-user")
	public String submitRegister(@ModelAttribute("userRegister") User registerUser, ModelMap model) {
		String s = userService.registeruser(registerUser);
		model.addAttribute("userRegister", s);
		return "response-success";
	}
	
	@PostMapping("/login-user")
	public String submitLogin(@ModelAttribute("userLogin") User loginUser, ModelMap model) {
		String s = userService.loginUser(loginUser);
		model.addAttribute("userLogin", s);
		return "response-success";
	}
	
}
