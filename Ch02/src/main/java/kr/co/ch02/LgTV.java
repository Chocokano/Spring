package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ltv")
public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;
	
	
	public void PowerOn() {
		System.out.println("LgTV powerOn...");
	}
	public void PowerOff() {
		System.out.println("LgTV powerOff...");
	}
	
	public void chUp() {
		System.out.println("LgTV chOn...");
	}
	public void chDown() {
		System.out.println("LgTV chDown...");
	}
	
	public void soundUp() {
		speaker.soundUp();
	}
	public void soundDown() {
		speaker.soundDown();
	}
	
	
}
