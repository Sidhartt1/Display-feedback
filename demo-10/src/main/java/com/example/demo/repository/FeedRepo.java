package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FeedBack;

public interface FeedRepo extends JpaRepository<FeedBack, Integer>
{
	
}