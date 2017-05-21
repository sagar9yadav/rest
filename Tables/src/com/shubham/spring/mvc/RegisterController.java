package com.shubham.spring.mvc;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class RegisterController {

	@RequestMapping(value = "/register")
	public String showRegisterform(Map model) throws ServletException {
		Student stu = new Student();
		model.put("student", stu);
		return "register";
	}

	@RequestMapping(value = "/registerStudent", method = RequestMethod.GET)
	public String registerStudent(HttpServletRequest request, Map model)
			throws ServletException {
		String stream = request.getParameter("stream");
		System.out.println("RegisterController.registerStudent()::"
				+ request.getParameter("test"));
		model.put("STU", stream);

		// Call Rest web Service
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);

		WebTarget webTarget = client.target(UriBuilder.fromUri(
				"http://localhost:8080/rest-test1").build());

		String restResponse = webTarget.path("/rest")
				.path("/hello/showMessage/sagar").request()
				.accept(MediaType.TEXT_PLAIN).get(String.class);
		model.put("REST", restResponse);
		return "home";
	}

}
