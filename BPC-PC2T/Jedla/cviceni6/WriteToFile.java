package com.vutbr.feec.cviceni6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public void appendToFile(File file, String strToAppend) {
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
			br.append(strToAppend);
		} catch (IOException e) {
			System.out.println("Soubor  nelze otevøít");
		}
	}
}
