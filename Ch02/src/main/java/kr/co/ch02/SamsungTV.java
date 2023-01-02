package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	
	public void PowerOn() {
		System.out.println("SamsungTV powerOn...");
	}
	public void PowerOff() {
		System.out.println("SamsungTV powerOff...");
	}
	
	public void chUp() {
		System.out.println("SamsungTV chOn...");
	}
	public void chDown() {
		System.out.println("SamsungTV chDown...");
	}
	
	public void soundUp() {
		speaker.soundUp();
	}
	public void soundDown() {
		speaker.soundDown();
	}
	
}
