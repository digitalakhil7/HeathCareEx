package com.appollo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appollo.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
