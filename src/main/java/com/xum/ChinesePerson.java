package com.xum;

import com.interfaces.Person;

public class ChinesePerson implements Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String sayLanguage() {
		// TODO Auto-generated method stub
		return getName() +" say Chinese,age is " + getAge();
	}

}
