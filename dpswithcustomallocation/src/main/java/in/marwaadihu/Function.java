package in.marwaadihu;

import java.util.Optional;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function {
	/**
	 * This function listens at endpoint "/api/HttpTrigger-Java". Two ways to invoke
	 * it using "curl" command in bash: 1. curl -d "HTTP Body" {your
	 * host}/api/HttpTrigger-Java&code={your function key} 2. curl "{your
	 * host}/api/HttpTrigger-Java?name=HTTP%20Query&code={your function key}"
	 * Function Key is not needed when running locally, it is used to invoke
	 * function deployed to Azure. More details:
	 * https://aka.ms/functions_authorization_keys
	 * 
	 * @throws JSONException
	 */
	@FunctionName("HttpTrigger-Java")
	public HttpResponseMessage run(@HttpTrigger(name = "req", methods = { HttpMethod.GET, HttpMethod.POST,
			HttpMethod.PUT }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
			final ExecutionContext context) {
		context.getLogger().info("Java HTTP trigger processed a request.");

		if (!request.getBody().isPresent()) {
			return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Please pass the request body").build();
		}

		context.getLogger().info(request.getBody().get());

		ResponseObjectForDps responseObjectForDps = new ResponseObjectForDps();
		//TODO: replace hostname of azure iot hub
		responseObjectForDps.setIotHubHostName("replace hostname of azure iot hub");

		return request.createResponseBuilder(HttpStatus.OK).header("Content-Type", "application/json")
				.body(responseObjectForDps).build();
	}
}
