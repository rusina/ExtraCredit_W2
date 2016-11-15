package edu.mum.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jsp.domain.Project;
import edu.mum.jsp.domain.Task;
import edu.mum.jsp.repository.IProjectDAO;
import edu.mum.jsp.repository.ITaskDAO;



@Service
@Transactional(propagation=Propagation.REQUIRED)
public class TaskService {
	@Autowired
	private ITaskDAO taskDAO;
	
	
	

	
	public void saveTask(Task T){
		
		taskDAO.save(T);
	}

	
}
