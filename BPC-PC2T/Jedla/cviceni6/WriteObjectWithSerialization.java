package com.vutbr.feec.cviceni6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectWithSerialization {
	public void serialize(File file, Student student) {
		try {
			FileOutputStream fl = new FileOutputStream(file, true);
			ObjectOutputStream out = new ObjectOutputStream(fl);

			// Method for serialization of object
			out.writeObject(student);

			out.close();
			fl.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}
}
