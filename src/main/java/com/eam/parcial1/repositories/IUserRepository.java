package com.eam.parcial1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eam.parcial1.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
