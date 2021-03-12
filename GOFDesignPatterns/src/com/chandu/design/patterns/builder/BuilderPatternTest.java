package com.chandu.design.patterns.builder;

import com.chandu.design.patterns.builder.HTTPClient.HttpClientBuilder;

public class BuilderPatternTest {

	public static void main(String[] args) {

		// This is the problem that Builder pattern will be providing the solution.
		// Where we need only few of the parameters to be used
		// This will work if we uncomment the constructor defined in HTTPClient Class
		// HTTPClient httpClient = new HTTPClient("GET", "http://google.com", null,
		// null, null, null);

		// Builder Pattern usage by appending the required parameters
		HttpClientBuilder builder = new HTTPClient.HttpClientBuilder();
		HTTPClient build = builder.method("POST").url("test.com").body("{}").build();
		System.out.println(build);

	}
}