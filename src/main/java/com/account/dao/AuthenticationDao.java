package com.account.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entity.Login;

public interface AuthenticationDao extends JpaRepository<Login, String> {

}
