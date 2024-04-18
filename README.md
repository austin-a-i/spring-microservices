# Microservices using Spring Cloud
 ---------------------------------------

Application Endpoints
---------------------------------

Currency Exchange Service
----------------------
http://localhost:8000/currency-exchange/from/USD/to/INR

Currency Conversion Service
--------------------------
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

Eureka
---------------------------
http://localhost:8761/

api-gateway
-------------------
http://localhost:8765/CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/USD/to/INR
http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-conversion-feign/from/USD/to/INR/quantity/10

----------------
/* To make upper case to lower case, in api-gateway application.properties, we can enable
	spring.cloud.gateway.discovery.locator.lowerCaseServiceId=true
	New urls
*/
	
http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-conversion-service/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-service/currency-conversion-feign/from/USD/to/INR/quantity/10

-----------------

http://localhost:8765/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
