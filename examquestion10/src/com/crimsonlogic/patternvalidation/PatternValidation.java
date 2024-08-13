package com.crimsonlogic.patternvalidation;

import com.crimsonlogic.operation.Operations;
import com.crimsonlogic.project.Project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternValidation extends Operations {

	Operations o = new Operations();
	Pattern p1 = Pattern.compile(".*hr.*");
	Pattern p2 = Pattern.compile("^[a-z][a-zA-z]*$");
	Pattern p3 = Pattern.compile(".*taskname.*");

	public void projectNameValidation() {
        for (Project p : projects) {
            String projectName = p.getProjectName();
            if (projectName != null) {
                Matcher matcher = p1.matcher(projectName);
                if (matcher.find()) {
                    System.out.println("Project name that contains 'hr': " + projectName);
                }
            }
        }
    }

	public void moduleNameValidation() {
        for (Project p : projects) {
            String moduleName = p.getModuleName();
            if (moduleName != null) {
                Matcher matcher = p3.matcher(moduleName);
                if (matcher.find()) {
                    System.out.println("Module name that contains 'taskname': " + moduleName);
                }
            }
        }
    }

	public void taskNameValidation() {
        for (Project p : projects) {
            String taskName = p.getTaskName();
            if (taskName != null) {
                Matcher matcher = p2.matcher(taskName);
                if (matcher.matches()) {
                    System.out.println("Task name that is in camel case: " + taskName);
                }
            }
        }
    }
	
	public void displayAllModules() {
		projects.stream().filter(e -> e.getModuleName().endsWith("e")).forEach(System.out::println);
	}

	public void displayProjectsWithMonths() {
		projects.stream().filter(d -> d.getProjectDuration()>12).forEach(System.out::println);
	}

}
