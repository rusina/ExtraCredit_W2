package edu.mum.jsp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.jsp.domain.Project;
import edu.mum.jsp.service.ProjectService;


@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
//	@RequestMapping(value = "/addProject", method= RequestMethod.GET)
	@RequestMapping("/addProject")
	public String addProject(@ModelAttribute("myProject")Project project){
		

	return "project";
	}
	
	@RequestMapping(value = "/addProject", method = RequestMethod.POST)
	public String saveProject(@ModelAttribute("myProject")Project project,BindingResult result){
		System.out.println(project.getName());
		System.out.println(project.getDescription());
		projectService.save(project);
		
		
		return "successPage";
	}


	
	
	
/*	@RequestMapping(value="/addProject", method= RequestMethod.GET)
	public String getAddProjectForm(@ModelAttribute("newProject")Project project){
		System.out.println("Reached here");
		return "addProject";
	}
	@RequestMapping(value = "/addProject", method = RequestMethod.POST)
	public String saveProject(@ModelAttribute("newProject")Project project,BindingResult result){
		System.out.println(project.getProjectName());
		
		return "successAdded";
	}*/
}
