package com.BikkadIt.phonebookApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.phonebookApplication.model.Contact;
import com.BikkadIt.phonebookApplication.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI{
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveCotact(Contact contact) {

    
		Contact save=contactRepository.save(contact);

		if(save !=null) {
			
			return true;
			
			
		} else {
			
		
		return false;
	}
		

	}		

	}

