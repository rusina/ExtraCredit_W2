package edu.mum.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.jsp.domain.Project;

@Repository
public interface IProjectDAO extends JpaRepository<Project, Integer> {

	public Project saveAndFlush(Project arg0);

	public List<Project> findAll();

	public Project findOneById(int id);

}
