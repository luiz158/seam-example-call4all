package org.jboss.seam.examples.call4all.security;

import static org.jboss.seam.security.annotations.management.EntityType.IDENTITY_CREDENTIAL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;
import org.jboss.seam.security.annotations.management.IdentityProperty;
import org.jboss.seam.security.annotations.management.PropertyType;

@Entity
@IdentityEntity(IDENTITY_CREDENTIAL)
public class IdentityCredential implements Serializable {
	
	private Long id;
	private String value;
	private IdentityObject identityObject;
	private IdentityCredentialType identityCredentialType;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@IdentityProperty(PropertyType.VALUE)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@ManyToOne
	public IdentityObject getIdentityObject() {
		return identityObject;
	}
	public void setIdentityObject(IdentityObject identityObject) {
		this.identityObject = identityObject;
	}
	@ManyToOne
	public IdentityCredentialType getIdentityCredentialType() {
		return identityCredentialType;
	}
	public void setIdentityCredentialType(
			IdentityCredentialType identityCredentialType) {
		this.identityCredentialType = identityCredentialType;
	}
	
	

}
