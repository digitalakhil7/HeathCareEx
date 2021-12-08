package com.appollo.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	
	@Override
	public List<Specialization> getAllSpecs() {
		return repo.findAll();
	}

	@Override
	public void deleteOneSpec(Long id) {
		repo.deleteById(id);	
	}

	@Override
	public Specialization getOneSepc(Long id) {
		Optional<Specialization> opt = repo.findById(id);
		Specialization s = null;
		if(opt.isPresent())
			s = opt.get();
		return s;
	}
}
