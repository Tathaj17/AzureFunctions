package com.example.model;

public class TokenDetail {

    public String token;
    public String header;
    public TokenDetail() {
    }
   
    public TokenDetail(String token, String header, String payload) {
		this.token = token;
		this.header = header;
		this.payload = payload;
	}
    
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	private String payload;

    

    public TokenDetail(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
