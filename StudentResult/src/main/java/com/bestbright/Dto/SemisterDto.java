package com.bestbright.Dto;

public class SemisterDto {
private Integer id;
private String name;
private Integer sub_id;
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
public Integer getSub_id() {
	return sub_id;
}
public void setSub_id(Integer sub_id) {
	this.sub_id = sub_id;
}
public SemisterDto() {
	super();
}
public SemisterDto(String name, Integer sub_id) {
	super();
	this.name = name;
	this.sub_id = sub_id;
}

}
