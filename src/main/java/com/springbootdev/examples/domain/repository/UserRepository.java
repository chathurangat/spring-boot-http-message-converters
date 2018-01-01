package com.springbootdev.examples.domain.repository;

import com.springbootdev.examples.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{

}
