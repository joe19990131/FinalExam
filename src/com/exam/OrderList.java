package com.exam;

public class OrderList {
int orderDish;
int amount;
public OrderList() {
	super();
}
public OrderList(int orderDish, int amount) {
	super();
	this.orderDish = orderDish;
	this.amount = amount;
}
public int getOrderDish() {
	return orderDish;
}
public void setOrderDish(int orderDish) {
	this.orderDish = orderDish;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}
