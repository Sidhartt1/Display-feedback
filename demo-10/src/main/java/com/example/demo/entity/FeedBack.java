package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FeedBack 
{
	@Id
	private int fid;
	
	@Column
	@NotBlank(message="please give ur name")
	private String fname;
	
	@Column
	@NotBlank(message = "please give ur feedback")
	private String feedbackd;
}