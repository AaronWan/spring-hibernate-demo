package com.aaron.exam.entity;

import java.util.List;

public class TextItem {
	private int id;
	private String desc;
	private PaperType paperType;
	private List<TextOption> options;
	public int getId() {
		return id;
	}

	public PaperType getPaperType() {
		return paperType;
	}

	public void setPaperType(PaperType paperType) {
		this.paperType = paperType;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setOptions(List<TextOption> options) {
		this.options = options;
	}

	public List<TextOption> getOptions() {
		return options;
	}

}
