package edu.mum.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.jsp.domain.Task;



public interface ITaskDAO extends JpaRepository<Task, Integer>{
	public Task saveAndFlush(Task arg0);
	public List<Task> findAll();
	public List<Task> findByProject_Id(int id);
}