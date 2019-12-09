package com.bestbright.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="marks")
public class Mark implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(name="give_mark")
	private int giveMark;
	@Column(name="get_mark")
	private int getMark;
	@ManyToOne
	@JoinColumn(name="stud_id")
	private Student student=new Student();
	//@JoinColumn(name="classes_id")
	//@ManyToOne
	//private Classes classes=new Classes();
	@ManyToOne
	@JoinColumn(name="sem_id")
	private Semister semister=new Semister();
	@ManyToOne
	@JoinColumn(name="sub_id")
	private Subject subject=new Subject();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGiveMark() {
		return giveMark;
	}
	public void setGiveMark(int giveMark) {
		this.giveMark = giveMark;
	}
	public int getGetMark() {
		return getMark;
	}
	public void setGetMark(int getMark) {
		this.getMark = getMark;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	/*public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}*/
	public Semister getSemister() {
		return semister;
	}
	public void setSemister(Semister semister) {
		this.semister = semister;
	}
	
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Mark() {
		super();
	}
	public Mark(String name, int giveMark, int getMark, Student student,
			Semister semister, Subject subject) {
		super();
		this.name = name;
		this.giveMark = giveMark;
		this.getMark = getMark;
		this.student = student;
		this.semister = semister;
		this.subject = subject;
	}
	
	
	
	
}
