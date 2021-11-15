package com.stripe.interview;

import com.google.common.html.HtmlEscapers;

public class Main {
	public static void main(String... args) {
		System.out.println("Hello world!");
		System.out.println("test for personal github");
		System.out.println("Final test after getting new intellij");
	}

	public static String useGuavaForSomeReason(String input) {
		return HtmlEscapers.htmlEscaper().escape(input);
	}
}
