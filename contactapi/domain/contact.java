package com.contactApi.contactapi.domain;

import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name="contact")
public class contact {
	
	@Id
	@UuidGenerator
	@Column(name="id", unique=true, updatable=false)
	private String id;
	private String name;
	private String title;
	private String phone;
	
	private String email;
	private String address;
	private String status;
	private String photoUrl;
	
	
	
	public contact() {
		
	}
	
	
	
	public contact(String id, String name, String title, String phone , String email, String address, String status, String photoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.title=title;
		this.phone=phone;
		this.email = email;
		this.address = address;
		this.status = status;
		this.photoUrl = photoUrl;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
