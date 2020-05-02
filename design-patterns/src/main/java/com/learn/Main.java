package com.learn;

import design_patterns.builder.computer_builder.Computer;
import design_patterns.builder.computer_builder.GamingLaptopBuilder;

public class Main {
	public static void main(String[] args) {
		GamingLaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();
		
		
		Computer laptop = gamingLaptopBuilder
				.company("Acer")
				.name("Predator")
				.battary("Lithium Ion")
				.port("USB")
				.port("ethernet")
				.port("LAN")
				.ram("DDR4", 8)
				.ram("DDR4", 8)
				.hardDrive("SSD", 1)
				.hardDrive("SSD", 1)
				.build();
		
		System.out.println(laptop.toString());
		
	}
}
