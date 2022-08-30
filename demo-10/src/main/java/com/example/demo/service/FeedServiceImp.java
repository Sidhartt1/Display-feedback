package com.example.demo.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FeedBack;
import com.example.demo.repository.FeedRepo;

@Service
public class FeedServiceImp implements FeedService
{
	@Autowired
	private FeedRepo repo;

	@Override
	public List<FeedBack> ShowAllFeed()
	{
		return repo.findAll();
	}

	@Override
	public FeedBack insertFeedback(FeedBack f) 
	{
		return repo.save(f);
	}

	@Override
	public List<FeedBack> insertMulFeedBack(List<FeedBack> f) 
	{
		return repo.saveAll(f);
	}
	
}