package com.zeroexception.zerobank.repository;

import com.zeroexception.zerobank.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
