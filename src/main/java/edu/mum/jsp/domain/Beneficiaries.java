package edu.mum.jsp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import cs544.extra.domain.Project;

@Entity
public class Beneficiaries {
	
@Id @GeneratedValue
private int BeneId;
@ManyToOne
private Project projects;
private String name;


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Project getProjects() {
	return projects;
}

public void setProjects(Project projects) {
	this.projects = projects;
}

public int getBeneId() {
	return BeneId;
}

public void setBeniId(int beneId) {
	BeneId = beneId;
}
List<Project> project = new ArrayList<Project>();
public void addProject(Project p){
	project.add(p);
}
}
