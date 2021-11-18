package com.appollo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appollo.entity.Specialization;
import com.appollo.repo.SpecializationRepository;
import com.appollo.service.ISpecializationService;
@Service
public class SpecializationServiceImpl implements ISpecializationService {
	@Autowired
	private SpecializationRepository repo;

	@Override
	public Long saveOneSpec(Specialization s) {
		repo.save(s);
		return s.getId();
	}
}
