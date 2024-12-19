package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
public class CheckVotingElgibility {
	@Value("${voter.id}")
	private int id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	private   Date  dov;
	
	
	public CheckVotingElgibility() {
		System.out.println("CheckVotingElgibility::0-param constructor");
	}
	
	@PostConstruct   //custom init life cycle method
	public  void myInit() {
		System.out.println("CheckVotingElgibility.myInit()");
		//initialize  left over property
		dov=new Date();
		//check whether important property is injected with correct value or not
		if(age<0 || age>120 || name==null ||name.length()==0 || name.equals("")) {
			throw new  IllegalArgumentException("invalid values for name, age properties");
		}
	}
	
	//b.methid
	public  String  checkElgibility() {
		System.out.println("CheckVotingElgibility.checkElgibility()");
		if(age<18)
			return "Mr/Miss/Mrs."+ name+"  u r  not elgible for voting.. verifined on::"+dov;
		else
			return "Mr/Miss/Mrs."+ name+"  u r   elgible for voting... verified on ::"+dov;
			
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("CheckVotingElgibility.myDestroy()");
		//nullify the bean properties
		name=null;
		id=0;
		age=0;
		dov=null;
	}

}
