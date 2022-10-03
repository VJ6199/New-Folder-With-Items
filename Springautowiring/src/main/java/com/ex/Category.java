package com.ex;

public class Category {
	private String name;
	private Book vj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category(Book vj) {
		super();
		this.vj = vj;
	}
	void show() {
		System.out.println("Book Name: "+vj.getBookName());
		System.out.println("Book Price: "+vj.getBookPrice());
		System.out.println("Book Author: "+vj.getBookAuthor());
	}

}
