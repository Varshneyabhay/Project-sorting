package com.epam.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.epam.dto.EcoServiceDto;
import com.epam.mapper.EcoServiceMapper;
import com.epam.service.EcoServiceService;

@RestController
@RequestMapping("/api/ecoservice")
public class EcoServiceController {

	@Autowired
	EcoServiceService ecoServiceService;
	
	@Autowired
	EcoServiceMapper ecoServiceMapper;
	
	@GetMapping
	public List<EcoServiceDto> getAllServices() {
		List<EcoServiceDto> ecoServices = ecoServiceMapper.ecoServiceListToEcoServiceListDto(ecoServiceService.getAllEcoService());
		if(!ecoServices.isEmpty()) {
			return ecoServices;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No EcoServices in Database!");
	}
	
}
