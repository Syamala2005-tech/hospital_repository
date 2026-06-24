package com.abc.demo.HospitalApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;
import com.abc.demo.HospitalApp.Services.HospitalServices;







@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	HospitalServices services;
	
	@PostMapping("/create")
	public void receivedata(@RequestBody HospitalEntity hospitalDetails) {
		services.createHospital(hospitalDetails);
	}
	@GetMapping("/ReadAll")
	public List<HospitalEntity> getAll() {
	    return services.ReadAllHospitals();
	}
	
	@GetMapping("/{id}")
	public Optional<HospitalEntity> getone(@PathVariable int id) {
	    return services.ReadParticularHospital(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteHospital(@PathVariable int id) {
	    services.DeleteParticularHospital(id);
	    return "Hospital deleted successfully";
	}
}

