package com.owen.Storm_Models;

public class Employee
{
	private String name;
	private int age;
	private boolean isMale;
	
	public Employee(String name, int age, boolean isMale)
	{
		super();
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean isMale()
	{
		return isMale;
	}
	public void setMale(boolean isMale)
	{
		this.isMale = isMale;
	}
}
