package com.bestbright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestbright.Dto.SemisterDto;
import com.bestbright.service.SemisterService;
@Controller
public class SemisterController {
	@Autowired
	SemisterService semisterService;
	@RequestMapping(value="/")
	public String semisterList(Model model){
		model.addAttribute("semisterList",semisterService.getSemisterList());
		//model.addAttribute("subjectList",semisterService.getSubjectList());
		return "sem_list";
	}
	
	@RequestMapping(value="/insert_sem.htm",method=RequestMethod.GET)
	public String newSemister(Model model){
		model.addAttribute("semDto",new SemisterDto());
		model.addAttribute("subjectList",semisterService.getSubjectList());
		return "new_semister";
	}
	@RequestMapping(value="/insert_sem.htm",method=RequestMethod.POST)
	public String postNewSemister(@ModelAttribute(value="semDto")SemisterDto semisterDto){
		semisterService.saveSemister(semisterDto);
		System.out.println(semisterDto.getName());
		return "redirect:/";
	}
}
