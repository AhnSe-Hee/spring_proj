package com.javalec.domain;
//도메인 클래스: 특정 테이블과 유사한 속성을 가지는 클래스

//스프링 MVC의 Model객체
public class ProductVO {

	private String name;
	private double price;
	
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
}

