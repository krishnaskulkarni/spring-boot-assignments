package com.capgemini.demohibernateonetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cert")
public class Certificate {

	@Id
	private int certId;
	private String certName;

	@ManyToOne
	private Person person;

	public Certificate(int certId, String certName) {
		super();
		this.certId = certId;
		this.certName = certName;
	}

	public Certificate() {
		super();
	}

	public int getCertId() {
		return certId;
	}

	public void setCertId(int certId) {
		this.certId = certId;
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}


	@Override
	public String toString() {
		return "Certificate [certId=" + certId + ", certName=" + certName + "]";
	}

}
