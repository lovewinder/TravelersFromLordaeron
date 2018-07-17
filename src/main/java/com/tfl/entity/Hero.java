package com.tfl.entity;

import java.util.Arrays;

public class Hero {

	private String name;
	private String attribute;
	private int[] location;
	private String detial;

	public String getDetial() {
		return detial;
	}

	public void setDetial(String detial) {
		this.detial = detial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public int[] getLocation() {
		return location;
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", attribute=" + attribute + ", location=" + Arrays.toString(location) + "]";
	}

}
