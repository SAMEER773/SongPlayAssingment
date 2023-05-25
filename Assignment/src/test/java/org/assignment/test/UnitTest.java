package org.assignment.test;

import org.testng.Assert;

public class UnitTest {

	public String songPlayUnit(String value) {

		String[] a = { "s1", "s2", "s3", "s4" };
		String[] playlist = new String[3];

		if (value.equalsIgnoreCase("s3")) {
			playlist[0] = a[0];
			playlist[1] = a[1];
			playlist[2] = a[2];
			return String.join(",", playlist);

		}
		// if we played song 4 s2,s3,s4
		else if (value.equalsIgnoreCase("s4")) {

			playlist[0] = a[1];
			playlist[1] = a[2];
			playlist[2] = a[3];
			return String.join(",", playlist);
		}
		// if we played song s2 s3,s4,s2
		else if (value.equalsIgnoreCase("s2")) {
			playlist[0] = a[2];
			playlist[1] = a[3];
			playlist[2] = a[1];
			return String.join(",", playlist);
		}
		// if we played song s1 s4.s2,s1
		else if (value.equalsIgnoreCase("s1")) {
			playlist[0] = a[3];
			playlist[1] = a[1];
			playlist[2] = a[0];
			return String.join(",", playlist);	
		} else if (value.matches("[0-9A-Za-z]")) {
			System.out.println("plese entre valid song name : it should be start with 's' following digit from 1 to 4");
			Assert.assertTrue(false);

		}

		return null;

	}

}
