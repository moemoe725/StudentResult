package com.bestbright.Dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MarkDto {
	private int id;
	@NotEmpty(message="Please Enter Name")
	private String name;
	private int giveMark;
	private int getMark;
	@NotNull(message="Please Enter Student Id")
	private int std_id;
	private int sub_id;
	@NotNull(message="Please Enter Semister Id")
	private int sem_id;
	private int classes_id;
	
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
	
	public int getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
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
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public int getSem_id() {
		return sem_id;
	}
	public void setSem_id(int sem_id) {
		this.sem_id = sem_id;
	}
	public MarkDto() {
		super();
	}
	
}
