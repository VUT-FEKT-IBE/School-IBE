package com.vutbr.feec5;

import java.util.ArrayList;
import java.util.List;

public class Database {

	List<Student> database = new ArrayList<Student>();

	public void vypis() {
		for (int i = 0; i < database.size(); i++) {
			System.out.println(database.get(i));
		}
	}

	public boolean erase(String email) {
		if (database.contains(email)) {
			database.remove(email);
			return true;
		} else {
			return false;
		}

	}

}
