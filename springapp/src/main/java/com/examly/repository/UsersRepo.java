package com.abacus.academy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abacus.academy.model.LoginModel;
import com.abacus.academy.model.UserModel;
import com.abacus.academy.model.UsersModel;

@Repository
public interface UsersRepo extends JpaRepository<UsersModel,String>{

	Optional<UsersModel> findByEmail(String email);



}
