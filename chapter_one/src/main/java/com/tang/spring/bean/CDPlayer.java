package com.tang.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tang.spring.service.CompactDisc;
import com.tang.spring.service.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cd; 
	
	public void play() {
		cd.play();
	}
//	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

}
