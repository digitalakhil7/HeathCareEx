package com.appollo.service;

import java.util.List;

import com.appollo.entity.Specialization;

public interface ISpecializationService {
	public Long saveOneSpec(Specialization s);
	public List<Specialization> getAllSpecs();
	public void deleteOneSpec(Long id);
	public Specialization getOneSepc(Long id);
}
