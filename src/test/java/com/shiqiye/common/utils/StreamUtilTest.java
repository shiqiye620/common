package com.shiqiye.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testRead() throws IOException {
		List<String> read = StreamUtil.read(new File("d:\\data.txt"));
		
		
		for (String string : read) {
			System.out.println(string);
		}
	}

}
