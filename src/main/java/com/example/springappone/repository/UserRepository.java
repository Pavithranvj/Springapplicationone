package com.example.springappone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springappone.entity.Usermodel;

@Repository

public interface UserRepository extends JpaRepository<Usermodel,Long>{

}