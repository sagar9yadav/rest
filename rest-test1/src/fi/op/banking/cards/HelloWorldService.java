package fi.op.banking.cards;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author yadav510
 *
 */
@Path(value = "/hello")
public class HelloWorldService {
	static {
		System.out.println("\nHelloWorldService::static::block::");
	}

	public HelloWorldService() {
		System.out.println("\nHelloWorldService()::args()::");
	}

	@GET
	@Path(value = "/showMessage/{param}")
	public Response getMessage(@PathParam("param") String message) {
		System.out.println("\nHelloWorldService::getMessage()::start::");
		String output = "Jesrsey say" + message;
		System.out.println("HelloWorldService::getMessage()::end::");
		return Response.status(200).entity(output).build();
	}
}
