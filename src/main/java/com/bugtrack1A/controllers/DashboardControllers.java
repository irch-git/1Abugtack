package com.bugtrack1A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bugtrack1A.dao.IMemberRepository;
import com.bugtrack1A.entities.MemberEntities;

@Controller
public class DashboardControllers {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping
	public String dashboardForm(Model model) {
		
		MemberEntities memberControllerHTML = new MemberEntities();
		model.addAttribute("memberDashFormHTML", memberControllerHTML);
		
		List<MemberEntities> memberList = memRepo.findAll();
		model.addAttribute("memberControllerList", memberList);
		
		return "main/dashboard";
	}
	
	@PostMapping("/saved")
	public String dashboardSaved(Model model, MemberEntities memberDashFormHTML) {
		
		memRepo.save(memberDashFormHTML);
		
		return "redirect:/";
	}
}
