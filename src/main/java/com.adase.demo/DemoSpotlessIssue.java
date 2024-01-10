package com.adase.demo;

public class DemoSpotlessIssue {

	public void demo(Object...args) {
		DemoRecord demoRecord = new DemoRecord("x", "y");
		Object result = switch (demoRecord) {
			case DemoRecord d when d.x != null -> demoRecord.x();
			case DemoRecord d when d.y != null -> demoRecord.y();
			default -> throw new IllegalStateException("Unexpected value: " + demoRecord);
		};
		System.out.println(result);
	}

	record DemoRecord(String x, String y) {

	}
}
