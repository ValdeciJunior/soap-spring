package com.valdev.soap.webservices.customersadministration.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import br.com.valdev.GetCustomerDetailRequest;
import br.com.valdev.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndPoint {
	@PayloadRoot(namespace="http://valdev.com.br", localPart = "")
	public GetCustomerDetailResponse processCustomerDetailRequest(GetCustomerDetailRequest request) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		
		return response;
	}
}
