package com.abacus.academy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abacus.academy.model.AdminModel;
import com.abacus.academy.model.LoginModel;
import com.abacus.academy.model.UserDAO;
import com.abacus.academy.model.UserModel;
import com.abacus.academy.model.UsersModel;
import com.abacus.academy.service.AuthService;
@CrossOrigin("*")
@RestController
public class AuthController {
	
	@Autowired
	AuthService authService;

	@PostMapping("/user/login")
	Map isUserPresent(@RequestBody LoginModel lm) {
		
		return authService.isUserPresent(lm);
	}
	
	@PostMapping("/admin/login")
	Boolean isAdminPresent(@RequestBody AdminModel lm) {
		
		return authService.isAdminPresent(lm);
	}
	
	@PostMapping("/admin/signup")
	Map<String, String> saveAdmin(@RequestBody AdminModel am) {
		return authService.saveAdmin(am);
	
	}

	@PostMapping("/user/signup")
	Map  saveUser(@RequestBody UsersModel  um) {
	System.out.println("coming");
	System.out.println(um);
	 Map<String, String> response =authService.saveUsers(um);
	 return response;
	}
}
