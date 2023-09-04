package com.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
	
	@Override
	public String toString() {
		return "Payload [iss=" + iss + ", sub=" + sub + ", aud=" + aud + ", iat=" + iat + ", exp=" + exp + ", azp="
				+ azp + ", gty=" + gty + ", permissions=" + permissions + "]";
	}
	private String iss;
	private String sub;
	private String aud;
	private String iat;
	private String exp;
	private String azp;
	private String gty;
	private List<String> permissions;
	
	public Payload(String iss, String sub, String aud, String iat, String exp, String azp, String gty,
			List<String> permissions) {
		super();
		this.iss = iss;
		this.sub = sub;
		this.aud = aud;
		this.iat = iat;
		this.exp = exp;
		this.azp = azp;
		this.gty = gty;
		this.permissions = permissions;
	}
	
	public Payload() {
		super();
	}

	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getAud() {
		return aud;
	}
	public void setAud(String aud) {
		this.aud = aud;
	}
	public String getIat() {
		return iat;
	}
	public void setIat(String iat) {
		this.iat = iat;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getAzp() {
		return azp;
	}
	public void setAzp(String azp) {
		this.azp = azp;
	}
	public String getGty() {
		return gty;
	}
	public void setGty(String gty) {
		this.gty = gty;
	}
	public List<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

}
