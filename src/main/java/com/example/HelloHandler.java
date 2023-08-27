package com.example;

import java.util.Base64;
import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import com.example.model.Greeting;
import com.example.model.TokenDetail;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;


public class HelloHandler extends FunctionInvoker<TokenDetail, Greeting> {
    
    @FunctionName("gettokendetails")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<TokenDetail>> request,
            ExecutionContext context) {
    	TokenDetail tokendetail = request.getBody()
                .filter((u -> u.getToken() != null))
                .orElseGet(() -> new TokenDetail(
                        request.getQueryParameters()
                                .getOrDefault("token", "empty")));
    	    context.getLogger().info("Token->>> " + tokendetail.getToken());
    	    String[] parts = tokendetail.getToken().split("\\.");
	        String header = parts[0];
	        String payload = parts[1];

	        Base64.Decoder decoder = Base64.getUrlDecoder();
	        String headerJson = new String(decoder.decode(header));
	        String payloadJson = new String(decoder.decode(payload));

	        System.out.println("Header: " + headerJson);
	        System.out.println("Payload: " + payloadJson);
	        tokendetail.setHeader(headerJson);
	        tokendetail.setPayload(payloadJson);
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(tokendetail, context))
                .header("Content-Type", "application/json")
                .build();
    }
    
}
