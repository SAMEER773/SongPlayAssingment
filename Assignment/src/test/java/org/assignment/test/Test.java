package org.assignment.test;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

public class Test {
	@org.testng.annotations.Test
	public void test() {
		UnitTest ut = new UnitTest();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("pleaes enter the song between s1 to s4");
		String nextLine = sc.nextLine();
		String songPlayUnit = ut.songPlayUnit(nextLine);

		if (nextLine.equalsIgnoreCase("s1")) {
			assertEquals(songPlayUnit, "s4,s2,s1");

		} else if (nextLine.equalsIgnoreCase("s2")) {
			assertEquals(songPlayUnit, "s3,s4,s2");

		} else if (nextLine.equalsIgnoreCase("s3")) {
			assertEquals(songPlayUnit, "s1,s2,s3");

		} else if (nextLine.equalsIgnoreCase("s4")) {
			assertEquals(songPlayUnit, "s2,s3,s4");

		}

		System.out.println(songPlayUnit);

	}

}
