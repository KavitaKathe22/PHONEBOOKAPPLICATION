package com.BikkadIt.phonebookApplication.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT_DTLS")
public class Contact {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_Name")
    private String contactName;
	
	@Column(name="CONTACT_NUMBER")
    private Long contactNumber;
	
	@Column(name="CONTACT_EMAIL")
    private String contactEmail;
	
	@Column(name="ACTIVE_SW")
    private Character activeSw;
	
	@Column(name="CREATE_DATE")
    private LocalDate createDate;
	
	@Column(name="UPDATE_DATE")
    private LocalDate updatedDate;
	
	
	
}
