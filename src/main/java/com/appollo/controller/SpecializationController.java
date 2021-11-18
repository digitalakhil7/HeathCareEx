package com.appollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appollo.entity.Specialization;
import com.appollo.service.ISpecializationService;

@Controller
@RequestMapping("/spec")
public class SpecializationController {
	@Autowired
	private ISpecializationService service;
	
	@GetMapping("/register")
	public String showReg() {
		return "SpecReg";
	}
	@PostMapping("/register")
	public String saveOneSpec(@ModelAttribute Specialization specialization,Model model) {
		Long id = service.saveOneSpec(specialization);
		model.addAttribute("msg","Spec '"+id+"' Created");
		return "SpecReg";
	}
	
} 
