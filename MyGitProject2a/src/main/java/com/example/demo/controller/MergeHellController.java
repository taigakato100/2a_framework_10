package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	void kadaiB() {
		Random rand = new Random();
		int kasu = (rand.nextInt() + 1) % 100;
		System.out.println(kasu + "が出ました");
	}
}