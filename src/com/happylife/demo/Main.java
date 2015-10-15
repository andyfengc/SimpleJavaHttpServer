package com.happylife.demo;

public class Main {
	public static void main(String[] args) {
		SimpleHttpServer httpServer = new SimpleHttpServer();
		httpServer.Start(7000);
	}
}
