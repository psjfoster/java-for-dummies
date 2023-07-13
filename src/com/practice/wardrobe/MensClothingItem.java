package com.practice.wardrobe;

public class MensClothingItem {
	private ClothingItemEnum item;
	private String desc;
	
	public MensClothingItem(String desc, ClothingItemEnum item) {
		this.item = item;
		this.desc = desc;
	}
	
	public String getItemString() {
		return item.toString();
	}
	
	public String getDesc() {
		return desc;
	}

}
