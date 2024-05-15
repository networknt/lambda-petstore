
package com.networknt.petstore.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the generated BusinessHandler for developers to write business logic for the Lambda function. Once this file
 * is generated, it won't be overwritten with another generation in the same folder.
 */
public class BusinessHandler {
    private static final Logger logger = LoggerFactory.getLogger(BusinessHandler.class);

    private BusinessHandler() {
    }

    private static final class InstanceHolder {
        private static final BusinessHandler INSTANCE = new BusinessHandler();
    }

    public static BusinessHandler getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent().withHeaders(headers);
        String output = "";
        output = "{}";
        response.withStatusCode(200)
                .withIsBase64Encoded(false)
                .withBody(output);
        return response;
    }
}
