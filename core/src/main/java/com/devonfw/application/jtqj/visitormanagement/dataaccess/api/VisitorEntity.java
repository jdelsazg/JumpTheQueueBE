package com.devonfw.application.jtqj.visitormanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.devonfw.application.jtqj.general.common.api.validation.EmailExtended;
import com.devonfw.application.jtqj.general.common.api.validation.Phone;
import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.jtqj.visitormanagement.common.api.Visitor;

@Entity
@Table(name = "Visitor")
public class VisitorEntity extends ApplicationPersistenceEntity implements Visitor {

	@NotNull
	@EmailExtended
	private String username;

	@NotNull
	private String name;

	@NotNull
	@Phone
	private String phoneNumber;

	private String password;

	private Boolean acceptedCommercial;

	private Boolean acceptedTerms;

	private Boolean userType;

	private static final long serialVersionUID = 1L;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAcceptedCommercial() {
		return acceptedCommercial;
	}

	public void setAcceptedCommercial(Boolean acceptedCommercial) {
		this.acceptedCommercial = acceptedCommercial;
	}

	public Boolean getAcceptedTerms() {
		return acceptedTerms;
	}

	public void setAcceptedTerms(Boolean acceptedTerms) {
		this.acceptedTerms = acceptedTerms;
	}

	public Boolean getUserType() {
		return userType;
	}

	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

}
