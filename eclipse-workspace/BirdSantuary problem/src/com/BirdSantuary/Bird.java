package com.BirdSantuary;



import java.util.Objects;

public class Bird {
	enum Color {
		BLACK, BROWN, WHITE, BLACK_WHITE, GREY, GREEN
	}

	String birdId;
	String name;
	Color color;

	@Override
	public String toString() {
		return "Bird [birdId=" + birdId + ", name=" + name + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birdId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(birdId, other.birdId);
	}

	public void eat() {
		System.out.println(getClass().getSimpleName() + " eats insacts");
	}

	public void fly() {
		System.out.println(getClass().getSimpleName() + " can fly");
	}

	public void swim() {
		System.out.println(getClass().getSimpleName() + " can swim");
	}

	public void setBirdId(String bId) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String bname) {
		// TODO Auto-generated method stub
		
	}

	
	public Color getColor() {
		return color;
	}

		

	public String getBirdId() {
		return birdId;
	}

	public String getName() {
		return name;
	}

	public void setColor(String bColor) {
		// TODO Auto-generated method stub
		
	}
}