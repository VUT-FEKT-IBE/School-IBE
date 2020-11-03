package com.vutbr.feec9;

import java.io.IOException;

public class function {
	public void press2Continue() {
		System.out.print("press anything\n");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
