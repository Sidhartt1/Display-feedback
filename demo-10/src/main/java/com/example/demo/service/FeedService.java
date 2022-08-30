package com.example.demo.service;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.entity.FeedBack;


public interface FeedService 
{

	public List<com.example.demo.entity.FeedBack> ShowAllFeed();

	public FeedBack insertFeedback(FeedBack f);

	public List<FeedBack> insertMulFeedBack(@Valid List<FeedBack> f);
	
}