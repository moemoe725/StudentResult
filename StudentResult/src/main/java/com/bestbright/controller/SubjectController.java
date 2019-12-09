package com.bestbright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestbright.Dto.SubjectDto;
import com.bestbright.service.SubjectService;

@Controller
public class SubjectController {
	@Autowired
	SubjectService subjectService;
	@RequestMapping(value="/cindex.htm")
	public String SubjectList(Model model){
		model.addAttribute("subjectList",subjectService.getsubjectList());
		return "sub_list";
	}
	@RequestMapping(value="/insert_sub.htm",method=RequestMethod.GET)
	public String newSubject(Model model){
		model.addAttribute("classesList", subjectService.getClassesList());
		model.addAttribute("subDto", new SubjectDto());
		return "new_subject";
	}
	@RequestMapping(value="/insert_sub.htm",method=RequestMethod.POST)
	public String postNewsubject(@ModelAttribute(value="subDto")SubjectDto subdto){
		subjectService.saveSubject(subdto);
		return "redirect:/cindex.htm";
	}
}
