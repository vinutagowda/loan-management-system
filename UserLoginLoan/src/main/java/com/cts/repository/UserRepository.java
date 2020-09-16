package com.cts.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.bean.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	public User findByUsername(String username);

}
