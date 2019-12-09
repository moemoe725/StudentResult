package com.bestbright.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="classes")
public class Classes implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy="classes",targetEntity=Student.class,fetch=FetchType.LAZY)
	private List<Student> student=new ArrayList<Student>();
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@OneToMany(mappedBy="classes",targetEntity=Subject.class,fetch=FetchType.LAZY)
	private List<Subject> subjectList=new ArrayList<Subject>();
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
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
	public Classes() {
		super();
	}
	public Classes(String name) {
		super();
		this.name = name;
	}
	
	
}
