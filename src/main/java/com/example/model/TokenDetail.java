package com.example.model;

public class TokenDetail {

	private String token;
    private Header header;
	private Payload payload;
	
    public TokenDetail() {
    }
   
    public TokenDetail(String token, Header header, Payload payload) {
		this.token = token;
		this.header = header;
		this.payload = payload;
	}

    public TokenDetail(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
    
    
}
