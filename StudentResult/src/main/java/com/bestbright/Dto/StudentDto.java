package com.bestbright.Dto;

public class StudentDto {
	private Integer id;
	private String name;
	private Integer classes_id;
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
	public Integer getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(Integer classes_id) {
		this.classes_id = classes_id;
	}
	public StudentDto() {
		super();
	}
	public StudentDto(String name, Integer classes_id) {
		super();
		this.name = name;
		this.classes_id = classes_id;
	}
	
}
