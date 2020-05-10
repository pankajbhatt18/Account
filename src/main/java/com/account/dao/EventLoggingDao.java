package com.account.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.model.EventLogging;

public interface EventLoggingDao extends JpaRepository<EventLogging, String> {

}
