package com.bestbright.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bestbright.Dto.MarkDto;
import com.bestbright.Dto.SemisterDto;
import com.bestbright.Dto.StudentClassDTO;
import com.bestbright.Dto.SubjectDto;
import com.bestbright.models.Student;
import com.bestbright.models.Subject;
import com.bestbright.service.MarkService;
import com.bestbright.service.SemisterService;
import com.bestbright.service.StudentService;
import com.bestbright.service.SubjectService;
@Controller
public class MarkController{
	@Autowired
	MarkService markService;
	@Autowired
	StudentService studentService;
	@Autowired
	SubjectService subjectService;
	@RequestMapping(value="/menu.htm")
	public String MarkList(Model model){
		model.addAttribute("markList",markService.getMarkList());
		return "mark_List";
	}
	@RequestMapping(value="/newMark.htm",method=RequestMethod.GET)
	public String NewMark(Model model){
		model.addAttribute("markDto",new MarkDto());
		model.addAttribute("studentList",markService.getStudentList());
		model.addAttribute("classesList",markService.getClassesList());
		model.addAttribute("semisterList",markService.getSemisterList());
		model.addAttribute("subjectList",markService.getSubjectList());
		return "new_Mark";
	}
	@RequestMapping(value="/newMark.htm",method=RequestMethod.POST)
	public String postNewMark(@Valid @ModelAttribute(value="markDto")MarkDto markDto,BindingResult result){
		if(result.hasErrors()){
			return "new_Mark";
		}else{
		markService.saveMark(markDto);
		return "redirect:/menu.htm";
		}
	}
	@RequestMapping(value="/getStudentListByClasses/{classesId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<StudentClassDTO> getStuList(@PathVariable(value="classesId")Integer id){
		List<StudentClassDTO> stuList=studentService.getStudentListByClassId(id);
		return stuList;
	}
	@RequestMapping(value="/getSubjectListByClasses/{classesId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<SubjectDto> getSemList(@PathVariable(value="classesId")Integer id){
		List<SubjectDto> subList=subjectService.getSubjectListByClassId(id);
		return subList;
	}
}
