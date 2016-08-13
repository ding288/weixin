package com.di.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.di.model.Module;
import com.di.service.AbstractService;
import com.di.service.ModuleService;

public class ModuleAction extends AbstractAction<Module> {
	@Autowired
	private ModuleService moduleService;

	@Override
	public AbstractService<Module> getAbstractService() {
		return moduleService;
	}

}
