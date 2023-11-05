package com.example.yass;

import javax.persistence.*;

@Entity
@Table(name = "clients")

public class Client {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String job;

	public Client() {
	}
	public Client(String name, String address, String job) {
		super();
		this.name = name;
		this.address = address;
		this.job = job;
	}

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
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getjob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
