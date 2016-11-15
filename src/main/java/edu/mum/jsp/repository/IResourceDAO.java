package edu.mum.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.jsp.domain.Resources;

public interface IResourceDAO extends JpaRepository<Resources, Integer>{
	public Resources saveAndFlush(Resources arg0);
	List<Resources> findAll();
}