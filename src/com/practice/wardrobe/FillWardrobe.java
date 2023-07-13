package com.practice.wardrobe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class FillWardrobe extends JFrame {
	
	public FillWardrobe() {

		MensClothingItem shirt = new MensClothingItem("Crisp blue check", ClothingItemEnum.SHIRT);
		MensClothingItem trouser = new MensClothingItem("Bright pink jeans", ClothingItemEnum.TROUSERS);
		MensClothingItem jacket = new MensClothingItem("Smart black pinstripe", ClothingItemEnum.JACKET);
		MensClothingItem coat = new MensClothingItem("North Face hi-vis", ClothingItemEnum.COAT);
		MensClothingItem tie = new MensClothingItem("School leaver colours", ClothingItemEnum.TIE);
		MensClothingItem shoes = new MensClothingItem("Beige AF Toms", ClothingItemEnum.SHOES);
		
		addItem(shirt);
		addItem(trouser);
		addItem(jacket);
		addItem(coat);
		addItem(tie);
		addItem(shoes);
		
		setTitle("Hello");
		
		// GridLayout(number rows, number columns, pixels between columns, pixels between rows)
		setLayout(new GridLayout(6, 2, 20, 0));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	
	void addItem(MensClothingItem item) {
		add(new JLabel("    " + item.getDesc()));
		add(new JLabel(item.getItemString()));
	}

}
