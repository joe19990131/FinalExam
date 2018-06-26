package com.exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dish d = new Dish();
		Order o = new Order();

		try {
			FileInputStream fis = new FileInputStream("menu.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while (line != null) {
				String[] tokens = line.split(",");
				int index = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int kcal = Integer.parseInt(tokens[3]);
				o.dishes.add(new Dish(index, name, price, kcal));
				line = in.readLine();

			}
			o.on();
			o.order();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
