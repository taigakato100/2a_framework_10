package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "回目のループだよ");
		}
	}

	void kadaiB() {
		Random rand = new Random();
		int kasu = (rand.nextInt() + 1) % 100;
		System.out.println(kasu + "が出ました");
	}

	void kadaiC() {
		int a;
		a = 50;

		int b;
		b = 75;

		int c;
		c = a + b;
		System.out.println(c);
	}
}