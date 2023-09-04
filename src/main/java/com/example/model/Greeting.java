package com.example.model;

public class Greeting {


	private TokenDetail message;

    public Greeting() {
    }

    public Greeting(TokenDetail message) {
        this.message = message;
    }

    public TokenDetail getMessage() {
        return message;
    }

    public void setMessage(TokenDetail message) {
        this.message = message;
    }
    
}
