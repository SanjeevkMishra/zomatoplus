package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import count.thinkxfactor.zomatoplus.models.User;
import count.thinkxfactor.zomatoplus.models.item;
public interface ItemRepository extends JpaRepository<User,Long>{
	User save(item items);

}
