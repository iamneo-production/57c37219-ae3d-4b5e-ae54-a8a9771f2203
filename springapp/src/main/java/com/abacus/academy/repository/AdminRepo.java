package com.abacus.academy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abacus.academy.model.AdminModel;
import com.abacus.academy.model.UserModel;
import com.abacus.academy.model.UsersModel;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel,String>{

	Optional<AdminModel> findByEmail(String email);

}