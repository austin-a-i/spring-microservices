package com.demo.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/*
 * To invoke microservices using Spring Cloud Proxy
 * @EnableFeignClients give in the caller Application class 
 * i.e, CurrencyConversionService here - Calling CurrencyExchangeService
 * 
 * To load balance between different port instance, remove the url part
 */

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
@FeignClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeRate(
					@PathVariable String from, @PathVariable String to);

}
