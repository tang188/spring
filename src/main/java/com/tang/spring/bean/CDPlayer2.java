package com.tang.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tang.spring.service.CompactDisc;
import com.tang.spring.service.MediaPlayer;

@Component
public class CDPlayer2 implements MediaPlayer{
	private CompactDisc cd; 
	
	public void play() {
		System.err.println("cd 2");
		cd.play();
	}
	@Autowired
	public CDPlayer2(CompactDisc cd) {
		this.cd = cd;
	}

}
