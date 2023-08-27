package com.example.model;

public class TokenDetail {

    private String token;
    private String header;
    public TokenDetail(String token, String header, String payload) {
		super();
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

    public TokenDetail() {
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
}
