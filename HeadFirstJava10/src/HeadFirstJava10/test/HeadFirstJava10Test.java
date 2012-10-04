package HeadFirstJava10.test;

import static org.junit.Assert.*;

import org.junit.Test;

import HeadFirstJava10.HeadFirstJava10;

public class HeadFirstJava10Test {

	final static int x;

	//スタティックイニシャライザ
	static {
		x =42;
	}

	HeadFirstJava10 headFirstJava10 = new HeadFirstJava10();

	@Test
	public void mathTest() {
		System.out.println();
	}

	@Test
	public void wrapTest() {
		System.out.println();
	}

	@Test
	public void formatsTest() {
		headFirstJava10.formatsTest();
		System.out.println();
	}
}
