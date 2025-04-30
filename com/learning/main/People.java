package com.learning.main;

import java.util.Objects;

public class People {

    private String name;
    private int age;
    private String address;

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

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    @Override
    public String toString() {
	return "People [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public People(String name, int age, String address) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
    }

    public People() {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
	return Objects.hash(address, age, name);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	People other = (People) obj;
	return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
    }

}
