package com.xfma.spring.demo.bean;

public class Person {
	private String personName;

	private Integer personAge;

	public Person() {
	}

	public Person(String personName, Integer personAge) {
		this.personName = personName;
		this.personAge = personAge;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person{" +
				"personName='" + personName + '\'' +
				", personAge=" + personAge +
				'}';
	}
}
