package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import count.thinkxfactor.zomatoplus.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByNameAndPassword(String name,String password);

}
