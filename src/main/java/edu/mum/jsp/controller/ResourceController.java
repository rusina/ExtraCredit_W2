package edu.mum.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.jsp.domain.Project;
import edu.mum.jsp.domain.Resources;
import edu.mum.jsp.repository.IProjectDAO;
import edu.mum.jsp.repository.IResourceDAO;

@Controller
public class ResourceController {
	
	@Autowired
	private IResourceDAO resourceDAO;
	
	@RequestMapping(value="/addResources")
	public String open(Model model){
		Resources r = new Resources();
		model.addAttribute("resource", r);
		return "addResource";
	}
	
	@RequestMapping(value="/addResources", method=RequestMethod.POST)
	public String add(Resources resource, Model model){
		resourceDAO.saveAndFlush(resource);
		return "successPage";
	}
}