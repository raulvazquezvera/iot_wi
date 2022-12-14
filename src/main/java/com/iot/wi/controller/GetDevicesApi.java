/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.iot.wi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.NativeWebRequest;

import com.iot.wi.model.DeviceDto;
import com.iot.wi.model.ErrorDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-18T21:23:58.041237+01:00[Europe/Madrid]")
@Validated
@Api(value = "getDevices", description = "the getDevices API")
public interface GetDevicesApi {

	default Optional<NativeWebRequest> getRequest() {
		return Optional.empty();
	}

	/**
	 * GET /getDevices : Find all devices from inventory
	 *
	 * @return Device removed (status code 200) or BadRequest (status code 400) or
	 *         Internal server error (status code 500) or Service unavailable
	 *         (status code 503)
	 */
	@ApiOperation(value = "Find all devices from inventory", nickname = "getDevicesGet", notes = "", response = DeviceDto.class, responseContainer = "List", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Device removed", response = DeviceDto.class, responseContainer = "List"),
			@ApiResponse(code = 400, message = "BadRequest", response = ErrorDto.class),
			@ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class),
			@ApiResponse(code = 503, message = "Service unavailable", response = ErrorDto.class) })
	@GetMapping(value = "/getDevices", produces = { "application/json" })
	default ResponseEntity<List<DeviceDto>> getDevicesGet() {
		getRequest().ifPresent(request -> {
			for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
				if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
					String exampleString = "{ \"serialNumber\" : 1234567, \"pinCode\" : 1234567, \"temperature\" : 3, \"id\" : 0, \"status\" : { \"id\" : 6, \"status\" : \"READY\" } }";
					ApiUtil.setExampleResponse(request, "application/json", exampleString);
					break;
				}
			}
		});
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

	}

}
