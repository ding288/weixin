package com.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.dao.AbstractDao;
import com.di.dao.ModuleDao;
import com.di.model.Module;
import com.di.service.ModuleService;

@Service("moduleService")
public class ModuleServiceImpl extends AbstractServiceImpl<Module> implements ModuleService {
	@Autowired
	private ModuleDao moduleDao;

	@Override
	public AbstractDao<Module> getAbstractDao() {
		return moduleDao;
	}

}
