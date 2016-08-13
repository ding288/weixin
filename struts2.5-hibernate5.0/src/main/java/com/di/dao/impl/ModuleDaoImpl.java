package com.di.dao.impl;

import org.springframework.stereotype.Repository;

import com.di.dao.ModuleDao;
import com.di.model.Module;

@Repository("moduleDao")
public class ModuleDaoImpl extends AbstractDaoImpl<Module> implements ModuleDao {

	@Override
	public Class<Module> getEntityClass() {
		return Module.class;
	}

}
