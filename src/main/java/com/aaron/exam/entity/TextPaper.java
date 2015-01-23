package com.aaron.exam.entity;

public class TextPaper {
private long id;
private String name;
private PaperType type;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PaperType getType() {
	return type;
}
public void setType(PaperType type) {
	this.type = type;
}

}
