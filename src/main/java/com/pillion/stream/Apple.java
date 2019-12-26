package com.pillion.stream;

public class Apple {
	private String city;
	private String colour;
	private Integer count;
	
	Apple(String city, String colour, int count) {
		this.city = city;
		this.colour = colour;
		this.count = count;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Apple [city=" + city + ", colour=" + colour + ", count=" + count + "]";
	}
}
