package com.test.spring.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.springboot.service.PackService;
import com.test.spring.springboot.vo.Pack;

@RestController
public class PackController {

	private Logger LOGGER = LoggerFactory.getLogger(PackController.class);

	@Autowired
	private PackService packageService;

	@RequestMapping("test")
	public String test() {
		return "SUCCESS";
	}

	@RequestMapping(method = RequestMethod.POST, path = "/package", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createPackage(@RequestBody Pack pack) {
		LOGGER.info(pack.toString());
		if (packageService.addPackage(pack)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/package", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updatePackage(@RequestBody Pack pack) {
		LOGGER.info(pack.toString());
		if (packageService.updatePackage(pack)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/package/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pack getPackage(@PathVariable String id) {
		LOGGER.info(id);
		return packageService.getPackage(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/package/{id}")
	public String deletePackage(@PathVariable String id) {
		if (packageService.deletePackage(id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/packages", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pack> getAllPackages() {
		return packageService.getPackages();
	}
}
