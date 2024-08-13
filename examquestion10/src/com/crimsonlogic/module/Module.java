package com.crimsonlogic.module;
import com.crimsonlogic.task.Task;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Module extends Task {
	
	private String moduleName;

}
