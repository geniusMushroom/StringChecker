package com.iSoftware.checker.stringChecker;

public class Checker {

	public static void main(String args[]) {
		String first = new String("Humty Dumpty sat on the wall");
		String second = new String("HUMTY DUMPTY SAT ON THE WALL");
		String third = new String("HUmty DUMPty saT oN thE WaLl");
		System.out.println("first equals to second:" + first.equalsIgnoreCase(second));
		System.out.println("first equals to third:" + first.equalsIgnoreCase(third));
		System.out.println("Second equals to first:" + second.equalsIgnoreCase(first));
		System.out.println("Second equals to third:" + second.equalsIgnoreCase(third));
		System.out.println("Third equals to first:" + third.equalsIgnoreCase(first));
		System.out.println("Third equals to second:" + third.equalsIgnoreCase(second));
	}
}
