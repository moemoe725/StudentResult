package com.bestbright.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject implements Serializable {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String name;
	@ManyToOne
	@JoinColumn(name="classes_id")
	private Classes classes=new Classes();
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
	
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public Subject() {
		super();
	}
	public Subject(String name) {
		super();
		this.name = name;
	}
	
}
