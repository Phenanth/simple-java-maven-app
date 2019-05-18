package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    public int bool = 1

    public App() {}

    public static void main(String[] args) {

    	if (bool) {
    		if (bool) {
    			System.out.println(new App().getMessage());
    		}
    	}


         System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
