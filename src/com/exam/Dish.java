package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Dish {
int index;
String name;
int price;
int kcal;

public Dish() {
	super();
}
public Dish(int index, String name, int price, int kcal) {
	super();
	this.index = index;
	this.name = name;
	this.price = price;
	this.kcal = kcal;
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getKcal() {
	return kcal;
}
public void setKcal(int kcal) {
	this.kcal = kcal;
}



}
