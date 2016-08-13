package com.di.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the role_module database table.
 * 
 */
@Entity
@Table(name="role_module")
@NamedQuery(name="RoleModule.findAll", query="SELECT r FROM RoleModule r")
public class RoleModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleModulePK id;

	public RoleModule() {
	}

	public RoleModulePK getId() {
		return this.id;
	}

	public void setId(RoleModulePK id) {
		this.id = id;
	}

}