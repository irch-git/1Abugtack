package com.bugtrack1A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack1A.dao.IMemberRepository;
import com.bugtrack1A.entities.MemberEntities;

@Controller
@RequestMapping("/members")
public class MemberControllers {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/new")
	public String displayForm(Model model) {
		
		MemberEntities memberControllerHTML = new MemberEntities();
		
		model.addAttribute("memberFormHTML", memberControllerHTML);
		
		return "Members/new-member";
	}
	
	@PostMapping("/saved")
	public String saveForm(Model model, MemberEntities memberFormHTML) {
		
		memRepo.save(memberFormHTML);
		
		return "redirect:/members/new";
	}
	
	@GetMapping 
	public String allMembers(Model model) {
		
		List<MemberEntities> memberList = memRepo.findAll();
		
		model.addAttribute("memberControllerList", memberList);
		
		return "Members/list-members";
	}
}
