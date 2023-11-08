package com.parthu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
public class Emp {
	private Integer id;
	private String name;
	private Double salary;
	private LocalDate doj;
	private String loc;
	private Integer age;

	public Emp(Integer id, String name, Double salary, LocalDate doj, String loc, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		this.loc = loc;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public String getLoc() {
		return loc;
	}
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + ", loc=" + loc + ", age="
				+ age + "]";
	}

	public static void main(String[] args) {

		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(10,"John",200.0,LocalDate.of(2018, 9, 20),"Hyd",23));
		al.add(new Emp(20,"kohn",300.0,LocalDate.of(2017, 9, 20),"Hyd",29));
		al.add(new Emp(30,"John",400.0,LocalDate.of(2003, 9, 20),"Delhi",31));
		al.add(new Emp(40,"Gohn",500.0,LocalDate.of(2019, 9, 20),"Chennai",27));
		al.add(new Emp(50,"Cohn",100.0,LocalDate.of(2021, 9, 20),"Delhi",19));
		
	}
	

}
