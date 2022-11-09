package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="empdata")
public class EmpdataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "employeeid")
	private Long employeeid;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "empstatus")
	private String empstatus;
	@Column(name = "emailaddress")
	private String emailaddress;
	@Column(name = "jobtitle")
	private String jobtitle;
	@Column(name = "internalstaff")
	private String internalstaff;
	@Column(name = "supervisor")
	private Long supervisor;
	@Column(name = "visastatus")
	private String visastatus;
	@Column(name = "gender")
	private String gender;
	@Column(name = "entity")
	private String entity;
	@Column(name = "dateofbirth")
	private String dateofbirth;
	@Column(name = "clientname")
	private String clientname;
	@Column(name = "clientcode")
	private String clientcode;
	@Column(name = "startdate")
	private String startdate;
	@Column(name = "createdby")
	private String createdby;
	@Column(name = "updatedby")
	private String updatedby;
	@Column(name = "immigrationstatus")
	private String immigrationstatus;
	@Column(name = "highestdegree")
	private String highestdegree;
	@Column(name = "university")
	private String university;
	@Column(name = "id")
	private Long id;
	@Column(name = "contactnumber")
	private Long contactnumber;
	@Column(name = "addressline1")
	private String addressline1;
	@Column(name = "addressline2")
	private String addressline2;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zipcode")
	private Long zipcode;
	@Column(name = "country")
	private String country;
	@Column(name = "ssn")
	private String ssn;
	@Column(name = "taxfilenumber")
	private Long taxfilenumber;
	@Column(name = "emergencynumber")
	private Long emergencynumber;
	@Column(name = "effectivedate")
	private String effectivedate;
	@Column(name = "location")
	private String location;
	@Column(name = "reportsto")
	private String reportsto;
	@Column(name = "payschedule")
	private String payschedule;
	@Column(name = "paytype")
	private String paytype;
	@Column(name = "payrate")
	private String payrate;
	@Column(name = "overtime")
	private String overtime;
	@Column(name = "overtimerate")
	private String overtimeratee;
	@Column(name = "changereason")
	private String changereason;
	@Column(name = "comment")
	private String comment;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "gpa")
	private String gpa;
	@Column(name = "degreestartdate")
	private String degreestartdate;
	@Column(name = "degreeenddate")
	private String degreeenddate;
	@Column(name = "date")
	private String date;
	@Column(name = "issuingcountry")
	private String issuingcountry;
	@Column(name = "issueddate")
	private String issueddate;
	@Column(name = "expirationdate")
	private String expirationdate;
	@Column(name = "status")
	private String status;
	@Column(name = "employementstatus")
	private String employementstatus;
	@Column(name = "jobeffectivedate")
	private String jobeffectivedate;
	@Column(name = "compensationeffectivedate")
	private String compensationeffectivedate;
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmpstatus() {
		return empstatus;
	}
	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getInternalstaff() {
		return internalstaff;
	}
	public void setInternalstaff(String internalstaff) {
		this.internalstaff = internalstaff;
	}
	public Long getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Long supervisor) {
		this.supervisor = supervisor;
	}
	public String getVisastatus() {
		return visastatus;
	}
	public void setVisastatus(String visastatus) {
		this.visastatus = visastatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientcode() {
		return clientcode;
	}
	public void setClientcode(String clientcode) {
		this.clientcode = clientcode;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getImmigrationstatus() {
		return immigrationstatus;
	}
	public void setImmigrationstatus(String immigrationstatus) {
		this.immigrationstatus = immigrationstatus;
	}
	public String getHighestdegree() {
		return highestdegree;
	}
	public void setHighestdegree(String highestdegree) {
		this.highestdegree = highestdegree;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Long getTaxfilenumber() {
		return taxfilenumber;
	}
	public void setTaxfilenumber(Long taxfilenumber) {
		this.taxfilenumber = taxfilenumber;
	}
	public Long getEmergencynumber() {
		return emergencynumber;
	}
	public void setEmergencynumber(Long emergencynumber) {
		this.emergencynumber = emergencynumber;
	}
	public String getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReportsto() {
		return reportsto;
	}
	public void setReportsto(String reportsto) {
		this.reportsto = reportsto;
	}
	public String getPayschedule() {
		return payschedule;
	}
	public void setPayschedule(String payschedule) {
		this.payschedule = payschedule;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getPayrate() {
		return payrate;
	}
	public void setPayrate(String payrate) {
		this.payrate = payrate;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getOvertimeratee() {
		return overtimeratee;
	}
	public void setOvertimeratee(String overtimeratee) {
		this.overtimeratee = overtimeratee;
	}
	public String getChangereason() {
		return changereason;
	}
	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	public String getDegreestartdate() {
		return degreestartdate;
	}
	public void setDegreestartdate(String degreestartdate) {
		this.degreestartdate = degreestartdate;
	}
	public String getDegreeenddate() {
		return degreeenddate;
	}
	public void setDegreeenddate(String degreeenddate) {
		this.degreeenddate = degreeenddate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIssuingcountry() {
		return issuingcountry;
	}
	public void setIssuingcountry(String issuingcountry) {
		this.issuingcountry = issuingcountry;
	}
	public String getIssueddate() {
		return issueddate;
	}
	public void setIssueddate(String issueddate) {
		this.issueddate = issueddate;
	}
	public String getExpirationdate() {
		return expirationdate;
	}
	public void setExpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmployementstatus() {
		return employementstatus;
	}
	public void setEmployementstatus(String employementstatus) {
		this.employementstatus = employementstatus;
	}
	public String getJobeffectivedate() {
		return jobeffectivedate;
	}
	public void setJobeffectivedate(String jobeffectivedate) {
		this.jobeffectivedate = jobeffectivedate;
	}
	public String getCompensationeffectivedate() {
		return compensationeffectivedate;
	}
	public void setCompensationeffectivedate(String compensationeffectivedate) {
		this.compensationeffectivedate = compensationeffectivedate;
	}
	@Override
	public String toString() {
		return "EmpdataModel [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", fullname=" + fullname + ", empstatus=" + empstatus + ", emailaddress=" + emailaddress
				+ ", jobtitle=" + jobtitle + ", internalstaff=" + internalstaff + ", supervisor=" + supervisor
				+ ", visastatus=" + visastatus + ", gender=" + gender + ", entity=" + entity + ", dateofbirth="
				+ dateofbirth + ", clientname=" + clientname + ", clientcode=" + clientcode + ", startdate=" + startdate
				+ ", createdby=" + createdby + ", updatedby=" + updatedby + ", immigrationstatus=" + immigrationstatus
				+ ", highestdegree=" + highestdegree + ", university=" + university + ", id=" + id + ", contactnumber="
				+ contactnumber + ", addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", country=" + country + ", ssn=" + ssn
				+ ", taxfilenumber=" + taxfilenumber + ", emergencynumber=" + emergencynumber + ", effectivedate="
				+ effectivedate + ", location=" + location + ", reportsto=" + reportsto + ", payschedule=" + payschedule
				+ ", paytype=" + paytype + ", payrate=" + payrate + ", overtime=" + overtime + ", overtimeratee="
				+ overtimeratee + ", changereason=" + changereason + ", comment=" + comment + ", specialization="
				+ specialization + ", gpa=" + gpa + ", degreestartdate=" + degreestartdate + ", degreeenddate="
				+ degreeenddate + ", date=" + date + ", issuingcountry=" + issuingcountry + ", issueddate=" + issueddate
				+ ", expirationdate=" + expirationdate + ", status=" + status + ", employementstatus="
				+ employementstatus + ", jobeffectivedate=" + jobeffectivedate + ", compensationeffectivedate="
				+ compensationeffectivedate + "]";
	}
	
}
