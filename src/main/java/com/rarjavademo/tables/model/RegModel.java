package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reg")

public class RegModel {
	 @Id
	 @GeneratedValue
	 @Column
	 private Long id;
	 @Column(name = "entity")
	    private String  entity;

	    @Column(name = "firstName")
	    private String firstName;
	    
	    @Column(name = "lastName")
	    private String lastName;
	    
	    @Column(name = "idnumber")
	    private String idnumber;
	    
	    @Column(name = "email")
	    private String  email;
	    
	    @Column(name = "phoneNumber")
	    private String  phoneNumber;
	    
	    @Column(name = "dateofBirth")
	    private String  dateofBirth;
	    
	    @Column(name = "gender")
	    private String  gender;
	    
	    @Column(name = "role")
	    private String  role;
	    
	    @Column(name = "address1")
	    private String  address1;
	    
	    @Column(name = "address2")
	    private String address2;
	    
	    @Column(name = "country")
	    private String country;
	    
	    @Column(name = "state")
	    private String  state;
	    
	    @Column(name = "city")
	    private String city;
	    
	    
	    @Column(name = "zipcode")
	    private String zipcode;
	    
	    @Column(name = "password")
	    private String password;
	    
	    @Column(name = "confirmPassword")
	    private String confirmPassword;
	    
	    @Column(name = "ans1")
	    private String  ans1;
	    
	    @Column(name = "ans2")
	    private String ans2;
	    
	    @Column(name = "ans3")
	    private String ans3;
	    
	    @Column(name = "ans4")
	    private String  ans4;
	    
	    @Column(name = "ans5")
	    private String  ans5;
	    
	    @Column(name = "status")
	    private String  status;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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

		public String getIdnumber() {
			return idnumber;
		}

		public void setIdnumber(String idnumber) {
			this.idnumber = idnumber;
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

		@Override
		public String toString() {
			return "RegModel [id=" + id + ", entity=" + entity + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", idnumber=" + idnumber + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dateofBirth="
					+ dateofBirth + ", gender=" + gender + ", role=" + role + ", address1=" + address1 + ", address2="
					+ address2 + ", country=" + country + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode
					+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", ans1=" + ans1 + ", ans2="
					+ ans2 + ", ans3=" + ans3 + ", ans4=" + ans4 + ", ans5=" + ans5 + ", status=" + status + "]";
		}

		
	    
	    
	  

}
