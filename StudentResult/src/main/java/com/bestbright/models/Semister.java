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
@Table(name="Semister")
public class Semister implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	/*@ManyToOne
	@JoinColumn(name="sub_id")
	private Subject subject=new Subject();*/
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
	
	/*public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Semister() {
		super();
	}
	public Semister(String name, Subject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}*/
	/*@OneToMany(mappedBy="semister",targetEntity=Mark.class)
	private List<Mark> mark=new ArrayList<Mark>();
	public List<Mark> getMark() {
		return mark;
	}
	public void setMark(List<Mark> mark) {
		this.mark = mark;
	}
	*/
}
