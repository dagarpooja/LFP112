package com.CartesionSystem;

public class CartesionSystem {

	public static void main(String[] args) {

		double distance;
		float x1 = 2f;
		float y1 = 3f;
		Float x2 = 1.123f;
		Float y2 = 1.123f;

		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of a line : " + distance);

		if (x2.equals(y2)) {

			System.out.println("equality of 2 Lengths is preferable");

		} else {
			System.out.println("equality of 2 Lengths is not preferable");
		}

		System.out.println("using compareTo method:" + x2.compareTo(y2));

	}
}
