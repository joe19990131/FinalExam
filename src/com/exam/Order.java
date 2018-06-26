package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
	List<Dish> dishes = new ArrayList<>();
	List<OrderList> odls = new ArrayList<>();

	public void on() {

		for (int i = 0; i < dishes.size(); i++) {
			Dish d = dishes.get(i);
			System.out.println(d.getIndex() + ") " + d.getName());
		}
		System.out.println("0) 結算");
		System.out.println("q) 離開(結束程式)");

	}

	public void order() {
		Scanner sc1 = new Scanner(System.in);
		Boolean a = true;
		while (a) {
			System.out.println("請輸入餐點: ");
			System.out.println("請輸入數量: ");
			int odl = sc1.nextInt();
			if (odl == 0) {
				a = false;
				break;
			}
			int amount = sc1.nextInt();
			
			
			odls.add(new OrderList(odl, amount));
			for (int i = 0; i < dishes.size(); i++) {
				Dish d = dishes.get(i);
				int dindex = d.getIndex();
				if (odl == dindex) {
					System.out.println(d.getName() + amount + "份");
					System.out.println("========================");
				}
			}
			for (int i = 0; i < dishes.size(); i++) {
				Dish d = dishes.get(i);
				System.out.println(d.getName());
				System.out.println("");
			}
			System.out.println("0) 結算");
			System.out.println("q) 離開(結束程式)");
		}
		
		for (int i = 0; i < odls.size(); i++) {
			for(int j = 0;j < dishes.size();j++){
				OrderList orderlist = odls.get(i);
				Dish d = dishes.get(j);
				int odl = orderlist.getOrderDish();
				int dindex = d.getIndex();
				if (odl == dindex) {
					System.out.println(d.getName()+""+orderlist.getAmount()+"份");
				}

				
			}
			
		}
		
	}
}
