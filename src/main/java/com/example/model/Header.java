package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {
	
	@Override
	public String toString() {
		return "Header [alg=" + alg + ", typ=" + typ + ", kid=" + kid + "]";
	}

	public Header(String alg, String typ, String kid) {
		super();
		this.alg = alg;
		this.typ = typ;
		this.kid = kid;
	}
	
	public Header() {
		super();
	}

	private String alg;
	private String typ;
	private String kid;
	
	public String getAlg() {
		return alg;
	}
	public void setAlg(String alg) {
		this.alg = alg;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getKid() {
		return kid;
	}
	public void setKid(String kid) {
		this.kid = kid;
	}
	

}
