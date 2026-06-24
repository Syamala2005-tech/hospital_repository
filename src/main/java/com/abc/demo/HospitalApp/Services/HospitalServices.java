package com.abc.demo.HospitalApp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;
import com.abc.demo.HospitalApp.Repository.HospitalRepository;

@Service
public class HospitalServices {
	@Autowired
	HospitalRepository hospitalrepo;

	public void createHospital(HospitalEntity hospitalDetails) {
		hospitalrepo.save(hospitalDetails);
	}
	public List<HospitalEntity> ReadAllHospitals() {
		return hospitalrepo.findAll();
	}
	public Optional<HospitalEntity> ReadParticularHospital(int id) {
		return hospitalrepo.findById(id);
	}
	public void DeleteParticularHospital(int id) {
		hospitalrepo.deleteById(id);
	}
}