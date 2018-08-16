package com.arvato.baboci.jsfBean;

import org.springframework.stereotype.Component;

@Component(value = "basicView")
public class BasicBean {

	private String text = "test";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
