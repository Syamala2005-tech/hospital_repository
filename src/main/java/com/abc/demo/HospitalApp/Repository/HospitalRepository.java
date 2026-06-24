package com.abc.demo.HospitalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;



@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Integer> {

}



