package com.di.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the role_module database table.
 * 
 */
@Embeddable
public class RoleModulePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="role_id")
	private int roleId;

	@Column(name="module_id")
	private int moduleId;

	public RoleModulePK() {
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoleModulePK)) {
			return false;
		}
		RoleModulePK castOther = (RoleModulePK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.moduleId == castOther.moduleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId;
		hash = hash * prime + this.moduleId;
		
		return hash;
	}
}