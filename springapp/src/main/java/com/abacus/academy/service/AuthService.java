package com.abacus.academy.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abacus.academy.model.AdminModel;
import com.abacus.academy.model.LoginModel;
import com.abacus.academy.model.UserDAO;
import com.abacus.academy.model.UserModel;
import com.abacus.academy.model.UsersModel;
import com.abacus.academy.repository.AdminRepo;
import com.abacus.academy.repository.LoginRepo;
import com.abacus.academy.repository.UserRepo;
import com.abacus.academy.repository.UsersRepo;

@Service
public class AuthService {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	LoginRepo loginRepo;
	
	@Autowired
	UsersRepo usersRepo;

	public Map<String, Object> isUserPresent(LoginModel lm) {
		Map<String, Object> m = new HashMap<String, Object>();
		 Optional<UsersModel> ls= usersRepo.findByEmail(lm.getEmail());
		System.out.println(ls.get().getEmail());
		 System.out.println(ls.get().getPassword());
		 System.out.println(ls.get().getRole());
		 
		 if(ls.get().getEmail().equalsIgnoreCase(lm.getEmail()) && ls.get().getPassword().equalsIgnoreCase(lm.getPassword()) && ls.get().getRole().equalsIgnoreCase(lm.getRole()))
		 {
			 m.put("userRole", ls.get().getRole());
				m.put("status", 200);
		 }
		else {
			m.put("message", "Login Failed");
			m.put("status", 400);
			
		}
		return m;
	}

	public Boolean isAdminPresent(AdminModel lm) {
		if(adminRepo.findByEmail(lm.getEmail()).isPresent()) {
			if(lm.getPassword().equals(adminRepo.findByEmail(lm.getEmail()).get().getPassword()))
				return true;
		}
		
		return false;
	}

	public Map<String, String> saveAdmin(AdminModel am) {
		
		Map<String, String> response = new HashMap<>();

		if(adminRepo.findByEmail(am.getEmail()).isPresent()) {
			response.put("statusCode", "000");
			response.put("response", "Admin already present with the email:" + am.getEmail());
			return response;
		}
		else {
			System.out.println(am.toString());
			adminRepo.save(am);
			response.put("statusCode", "200");
			response.put("response", "Admin added");
			return response;
			
		}
	}

//	public Map<String, String> saveUser(UserModel um) {
//		Map<String, String> response = new HashMap<>();
//		if(loginRepo.findById(um.getEmail()).isPresent()) {
//			response.put("statusCode", "000");
//			response.put("response", "User already present with the email: "+um.getEmail());
//			return response;
//		}
//		else {
////			System.out.println(um.toString());
//			userRepo.save(um);
//			
////			LoginModel lm = new LoginModel();
////			lm.setEmail(um.getEmail());
////			lm.setPassword(um.getPassword());
////			loginRepo.save(lm);
//			response.put("statusCode", "200");
//			response.put("message", "User Aded");
//			return response;
//		}
//	}
	
	public Map<String, String> saveUsers(UsersModel um) {
		Map<String, String> response = new HashMap<>();
		if(usersRepo.findByEmail(um.getEmail()).isPresent()) {
			response.put("statusCode", "000");
			response.put("response", "User already present with the email: "+um.getEmail());
			return response;
		}
		else {
//			System.out.println(um.toString());
			usersRepo.save(um);
			
//			LoginModel lm = new LoginModel();
//			lm.setEmail(um.getEmail());
//			lm.setPassword(um.getPassword());
//			loginRepo.save(lm);
			response.put("statusCode", "200");
			response.put("message", "User Aded");
			return response;
		}
		
	}

}
