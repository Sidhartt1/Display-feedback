package com.example.demo.controller;

import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FeedBack;
import com.example.demo.service.FeedService;

@RestController
public class FeedBackController 
{
	@Autowired
	private FeedService serv;
	
	@GetMapping("/viewFeed")
	public List<FeedBack> showFeedBack()
	{
		return serv.ShowAllFeed();
	}
	
	@PostMapping("/insertFeed")
	public FeedBack insertFeed(@Valid @RequestBody FeedBack f)
	{

		return serv.insertFeedback(f);
	}
	
	@PostMapping("/insertFeeds")
	public List<FeedBack> insertMulFeed(@Valid @RequestBody List<FeedBack> f)
	{
		return serv.insertMulFeedBack(f);
	}
	
}