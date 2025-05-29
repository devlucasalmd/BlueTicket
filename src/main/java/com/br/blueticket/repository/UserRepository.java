package com.br.blueticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.blueticket.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
