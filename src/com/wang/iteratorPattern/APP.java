package com.wang.iteratorPattern;

public class APP {

	public static void main(String[] args) {

		Aggregete agg = new ConcreteAggregate();

		agg.add("a");
		agg.add("b");
		agg.add("v");
		agg.add("f");
		agg.add("t");
		agg.add("w");
		agg.add("d");
		agg.add("h");

		Iterator iterator = agg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
