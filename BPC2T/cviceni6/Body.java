package com.vutbr.feec4;

import java.io.File;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open person.csv change to 
		File persons = new File(
				"C:\\Users\\Jakub\\Desktop\\vut_fekt\\school_2018_2019\\program_java\\com.vutbr.feec\\src\\com\\vutbr\\feec4\\persons.csv");
		String x = "sdkbksbkjdnlsdnksdndskj;sddhd;sddsdsd;";
		Student st = new Student();
		st.setId(1);
		st.setName("jakub");
		WriteObjectWithSerialization wows = new WriteObjectWithSerialization();
		wows.serialize(persons, st);
		WriteToFile wr = new WriteToFile();
		wr.appendToFile(persons, x);
		ReadFromFile re = new ReadFromFile();
		re.readFile(persons);
		// System.out.println(re.readFile(persons));

		// don't remember why it's here
		int zero = 0;
		int[][] matrix = new int[3][3];
		for (int i = 0; i < 3; i++) {
			System.out.format("%-3d", zero);
			for (int k = 0; k < 2; k++) {
				System.out.format("%-3d", zero);
			}
			System.out.println();
		}
		
	}

}
