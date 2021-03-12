package com.chandu.design.patterns.builder;

public class HTTPClient {

	private String method;
	private String url;
	private String userName;
	private String password;
	private String headers;
	private String body;

// This is the constructor that contains all the parameters which are required to be mentioned 
// Solution is the Builder Pattern as below by creating a inner static Class 
	/*
	 * public HTTPClient(String method, String url, String userName, String
	 * password, String headers, String body) { super(); this.method = method;
	 * this.url = url; this.userName = userName; this.password = password;
	 * this.headers = headers; this.body = body; }
	 */

	// This is the constructor that is used in Builder Pattern to build the Client
	public HTTPClient(HttpClientBuilder httpClientBuilder) {
		this.method = httpClientBuilder.method;
		this.url = httpClientBuilder.url;
		this.userName = httpClientBuilder.userName;
		this.password = httpClientBuilder.password;
		this.headers = httpClientBuilder.headers;
		this.body = httpClientBuilder.body;

	}

	// Inner static class that implements the Builder Pattern
	public static class HttpClientBuilder {
		private String method;
		private String url;
		private String userName;
		private String password;
		private String headers;
		private String body;

		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttpClientBuilder login(String userName, String password) {
			this.userName = userName;
			this.password = password;
			return this;
		}

		public HttpClientBuilder headers(String headers) {
			this.headers = headers;
			return this;
		}

		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}

		public HTTPClient build() {
			return new HTTPClient(this);
		}

	}

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "HTTPClient [method=" + method + ", url=" + url + ", userName=" + userName + ", password=" + password
				+ ", headers=" + headers + ", body=" + body + "]";
	}

}
