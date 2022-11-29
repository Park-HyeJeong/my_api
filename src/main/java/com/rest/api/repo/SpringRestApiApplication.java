package com.rest.api.repo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringRestApiApplication extends JpaRepository<User, Long> {}

