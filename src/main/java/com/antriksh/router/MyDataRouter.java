package com.antriksh.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyDataRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:E:\\source").to("file:E:\\destination");
	}

}
