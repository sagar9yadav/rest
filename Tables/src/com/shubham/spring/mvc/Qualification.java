package com.shubham.spring.mvc;

public class Qualification {
	private String stream;

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Qualification [stream=" + stream + "]";
	}

}
