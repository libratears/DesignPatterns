package com.libratears.pattern.creational.builder;

/**
 * @ClassName: Product1
 * @Description: 具体产品
 * @date 2013-4-26 下午9:57:25
 * 
 * @author libratears
 * @version V1.0
 */
public class Product1 implements Product {

	private String _part1;

	private String _part2;

	public String getPart1() {
		return _part1;
	}

	public void setPart1(String part1) {
		this._part1 = part1;
	}

	public String getPart2() {
		return _part2;
	}

	public void setPart2(String part2) {
		this._part2 = part2;
	}

	public String toString() {
		return "part1:" + _part1 + " part2:" + _part2;
	}
}
