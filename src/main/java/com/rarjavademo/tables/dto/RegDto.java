package com.rarjavademo.tables.dto;


import com.rarjavademo.tables.model.RegModel;

public class RegDto {
	private String entity;
	private String idnumber;
    private String firstName;
    private String lastName;
    private String epaymentdate;
    private String  email;
    private String phoneNumber;
    private String dateofBirth;
    private  String gender;
    private String role;
    private String address1;
    private  String address2;
    private String country;
    private String  state;
    private String city;
    private String zipcode;
    private  String password;
    private String confirmPassword;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private  String ans5;
    private String status;
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEpaymentdate() {
		return epaymentdate;
	}
	public void setEpaymentdate(String epaymentdate) {
		this.epaymentdate = epaymentdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getAns1() {
		return ans1;
	}
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}
	public String getAns2() {
		return ans2;
	}
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}
	public String getAns3() {
		return ans3;
	}
	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}
	public String getAns4() {
		return ans4;
	}
	public void setAns4(String ans4) {
		this.ans4 = ans4;
	}
	public String getAns5() {
		return ans5;
	}
	public void setAns5(String ans5) {
		this.ans5 = ans5;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	  public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public static RegDto getDto(RegModel i){
	    	RegDto Rdt= new RegDto();
	        Rdt.setEntity(i.getEntity());
	        Rdt.setFirstName(i.getFirstName());
	        Rdt.setLastName(i.getLastName());
	        Rdt.setIdnumber(i.getIdnumber());
	        Rdt.setEmail(i.getEmail());
	        Rdt.setPhoneNumber(i.getPhoneNumber());
	        Rdt.setDateofBirth(i.getDateofBirth());
	        Rdt.setGender(i.getGender());
	        Rdt.setRole(i.getRole());
	        Rdt.setAddress1(i.getAddress1());
	        Rdt.setAddress2(i.getAddress2());
	        Rdt.setCountry(i.getCountry());
	        Rdt.setState(i.getState());
	        Rdt.setCity(i.getCity());
	        Rdt.setZipcode(i.getZipcode());
	        Rdt.setPassword(i.getPassword());
	        Rdt.setCountry(i.getCountry());
	        Rdt.setState(i.getState());
	        Rdt.setCity(i.getCity());
	        Rdt.setZipcode(i.getZipcode());
	        Rdt.setPassword(i.getPassword());
	        return Rdt;
	    }
	
	
   
}
