package com.ruoxu.pattern.prototype.deep;

public class User implements Cloneable{
	private String name;
	private int age;
	private Address address;
	
	public User(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	@Override
	protected User clone() {
		try {
			User user = (User) super.clone();
			user.address = this.address.clone(); 
			return user;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
