package com.bestbright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestbright.Dto.StudentDto;
import com.bestbright.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	@RequestMapping(value="/index.htm")
	public String StudentList(Model model){
		model.addAttribute("StudentList",studentService.getStudentList());
		model.addAttribute("ClassesList",studentService.getClassesList());
		return "studentList";
	}
	@RequestMapping(value="/new_student.htm",method=RequestMethod.GET)
	public String NewStudent(Model model){
		model.addAttribute("student",new StudentDto());
		model.addAttribute("ClassesList",studentService.getClassesList());
		return "newStudent";
	}
	@RequestMapping(value="/new_student.htm",method=RequestMethod.POST)
	public String PostNewStudent(@ModelAttribute(value="student")StudentDto stuDto){
	studentService.saveStudent(stuDto);
	return "redirect:/index.htm";
	}
}
