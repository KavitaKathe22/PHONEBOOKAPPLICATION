package com.BikkadIt.phonebookApplication.service;

import org.springframework.http.ResponseEntity;

import com.BikkadIt.phonebookApplication.model.Contact;

public interface ContactServiceI {

	boolean saveCotact(Contact contact);
	
//	Phonebook savePhonebook(Phonebook phonebook);


}
