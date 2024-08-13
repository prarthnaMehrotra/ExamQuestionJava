package com.crimsonlogic.project;
import com.crimsonlogic.module.Module;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Project extends Module {
	
	private int projectId;
	private String projectName;
	private int projectDuration;

}
