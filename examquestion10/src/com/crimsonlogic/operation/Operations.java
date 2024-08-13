package com.crimsonlogic.operation;
import com.crimsonlogic.project.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations extends Project {
	
	protected List<Project> projects = new ArrayList<Project>();
	Project p = null;
	Scanner sc = new Scanner(System.in);
	int n;
	
	public void takeProjectInfo() {
		System.out.println("Enter the number of projects : ");
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			p = new Project();
			System.out.println("Enter the project name : ");
			p.setProjectName(sc.nextLine());
			System.out.println("Enter the project id : ");
			p.setProjectId(sc.nextInt());
			System.out.println("Enter the project duration : ");
			p.setProjectDuration(sc.nextInt());
			sc.nextLine();
			
			projects.add(p);
		}

	}
	
	public void takeModuleInfo() {
		for(Project p : projects) {
			System.out.println("Enter the module name : ");
			p.setModuleName(sc.nextLine());
		}
	}
	
	public void takeTaskInfo() {
		for(Project p : projects) {
			System.out.println("Enter the task name : ");
			p.setTaskName(sc.nextLine());
		}
	}

}
