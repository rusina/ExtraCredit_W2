package edu.mum.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jsp.domain.Project;
import edu.mum.jsp.domain.Task;
import edu.mum.jsp.repository.IProjectDAO;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class ProjectService {

	@Autowired
	private IProjectDAO projectDAO;
	
	public void save(Project p){
		projectDAO.saveAndFlush(p);
	}
	
	public List<Project> getProjects(){
		return projectDAO.findAll();
	}
	
	public List<Task> getTasks(int projectId){
		return projectDAO.findOneById(projectId).getTaskList();
	}
}
