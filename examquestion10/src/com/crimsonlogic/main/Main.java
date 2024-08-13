package com.crimsonlogic.main;

import com.crimsonlogic.patternvalidation.PatternValidation;

public class Main {

	public static void main(String[] args) {
		
		PatternValidation pv = new PatternValidation();
		pv.takeProjectInfo();
		pv.takeModuleInfo();
		pv.takeTaskInfo();
		pv.projectNameValidation();
		pv.moduleNameValidation();
		pv.taskNameValidation();
		pv.displayProjectsWithMonths();

	}

}
