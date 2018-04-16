package com.tang.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tang.spring.CDPalyerConfig;
import com.tang.spring.bean.SgtPeppers;
import com.tang.spring.service.CompactDisc;
import com.tang.spring.service.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPalyerConfig.class)
public class Mytest {

	@Autowired
	private CompactDisc cd;
	@Autowired
	private SgtPeppers sp;
	@Test
	public void test1() {
		assertNotNull(cd);
		sp.play();
	}
	
	@Autowired
	MediaPlayer player;
	
	@Test
	public void play() {
		player.play();
	}
}
