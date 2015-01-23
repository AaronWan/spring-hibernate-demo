package com.aaron.exam.entity;

public enum TextItemType {
	CHOICE(1, "单选"), CHOICES(2, "多选"), FILLWORD(3, "填空"), JUDGE(4, "判断"), FILETEXT(
			5, "问答");
	private int id;
	private String name;

	TextItemType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static TextItemType getItemType(int id) {
		TextItemType type = null;
		switch (id) {
		case 1:
			type = CHOICE;
			break;
		case 2:
			type = CHOICES;
			break;
		case 3:
			type = FILETEXT;
			break;
		case 4:
			type = JUDGE;
			break;
		case 5:
			type = FILETEXT;
			break;
		default:
			System.out.println("no this item type");
			;

		}
		return type;
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

}
