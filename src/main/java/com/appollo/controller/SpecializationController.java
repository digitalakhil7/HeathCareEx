package com.appollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/all")
	public String all(Model model) {
		List<Specialization> list = service.getAllSpecs();
		model.addAttribute("list",list);
		return "SpecData";
	}
	@GetMapping("/delete")
	public String deleteSepc(@RequestParam Long id) {
		service.deleteOneSpec(id);
		return "redirect:all";
	}
	@GetMapping("/edit")
	public String editSepc(@RequestParam Long id,Model model) {
		Specialization s = service.getOneSepc(id);
		model.addAttribute("specialization",s);
		return "SpecEdit";
	}
	@PostMapping("/update")
	public String updateSepc(@ModelAttribute Specialization specialization,Model model) {
		service.saveOneSpec(specialization);
		return "redirect:all";
	}
	
} 
