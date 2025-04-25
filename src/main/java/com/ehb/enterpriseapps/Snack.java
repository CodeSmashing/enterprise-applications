package com.ehb.enterpriseapps;

import java.io.Serializable;

public class Snack implements Comparable<Snack>, Serializable {
	private static int idCounter = 0;
	private int articleCode;
	private String name;
	private double price;

	public Snack(String name, double price) {
		this.articleCode = idCounter++;
		this.name = name;
		this.price = price;
	}

	public Snack() {
		this.articleCode = idCounter++;
		this.name = "Unknown";
		this.price = 0.0;
	}

	public int getArticleCode() {
		return articleCode;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Snack other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Snack{" +
				"articleCode=" + articleCode +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
