package com.di.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the module database table.
 * 
 */
@Entity
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="module_id")
	private Integer moduleId;

	@Column(name="module_code")
	private String moduleCode;

	@Column(name="module_name")
	private String moduleName;

	@Column(name="parent_module_id")
	private Integer parentModuleId;

	public Module() {
	}

	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getParentModuleId() {
		return this.parentModuleId;
	}

	public void setParentModuleId(int parentModuleId) {
		this.parentModuleId = parentModuleId;
	}

}