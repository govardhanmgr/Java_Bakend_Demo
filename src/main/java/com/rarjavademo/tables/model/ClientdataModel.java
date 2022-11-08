package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientdata")
public class ClientdataModel {
	@Id
    @GeneratedValue
    @Column
    private Long id;
	@Column(name = "clientcode")
	private Long clientcode;
	@Column(name = "clientname")
	private String clientname;
	@Column(name = "taxfederal")
	private Long taxfederal;
	@Column(name = "clientlocation")
	private String clientlocation;
	@Column(name = "agreementstartdate")
	private String agreementstartdate;
	@Column(name = "serviceagreementonboarded")
	private String serviceagreementonboarded;
	@Column(name = "agreementenddate")
	private String agreementenddate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getClientcode() {
		return clientcode;
	}
	public void setClientcode(Long clientcode) {
		this.clientcode = clientcode;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public Long getTaxfederal() {
		return taxfederal;
	}
	public void setTaxfederal(Long taxfederal) {
		this.taxfederal = taxfederal;
	}
	public String getClientlocation() {
		return clientlocation;
	}
	public void setClientlocation(String clientlocation) {
		this.clientlocation = clientlocation;
	}
	public String getAgreementstartdate() {
		return agreementstartdate;
	}
	public void setAgreementstartdate(String agreementstartdate) {
		this.agreementstartdate = agreementstartdate;
	}
	public String getServiceagreementonboarded() {
		return serviceagreementonboarded;
	}
	public void setServiceagreementonboarded(String serviceagreementonboarded) {
		this.serviceagreementonboarded = serviceagreementonboarded;
	}
	public String getAgreementenddate() {
		return agreementenddate;
	}
	public void setAgreementenddate(String agreementenddate) {
		this.agreementenddate = agreementenddate;
	}
	@Override
	public String toString() {
		return "ClientdataModel [id=" + id + ", clientcode=" + clientcode + ", clientname=" + clientname
				+ ", taxfederal=" + taxfederal + ", clientlocation=" + clientlocation + ", agreementstartdate="
				+ agreementstartdate + ", serviceagreementonboarded=" + serviceagreementonboarded
				+ ", agreementenddate=" + agreementenddate + "]";
	}
	
}
