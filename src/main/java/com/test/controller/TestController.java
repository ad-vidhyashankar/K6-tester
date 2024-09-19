package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.RestRequest;
import com.test.model.RestResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

	@PostMapping("/customers")
	ResponseEntity<RestResponse> newEmployee(@RequestBody RestRequest rest) {
		RestResponse response = new RestResponse();
		log.info("Request:"+rest.getId());
		response.setMessage("Customer add successfully");
		return ResponseEntity.ok(response);
	}
}
