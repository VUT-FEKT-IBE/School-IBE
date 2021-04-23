package com.vutbr.feec.cviceni3.CustomExceptions;

public class Package {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			throw (new chyba(name));
		}

		this.name = name;

	}
}
