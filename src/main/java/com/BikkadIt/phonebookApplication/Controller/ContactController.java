package com.BikkadIt.phonebookApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIt.phonebookApplication.model.Contact;
import com.BikkadIt.phonebookApplication.service.ContactServiceI;

@Controller
public class ContactController {
     
	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value="/saveContact",consumes="APPLICATION/JSON")
	public ResponseEntity<String> saveCotact(@RequestBody Contact contact){
		
		boolean save = contactServiceI.saveCotact(contact);
		
		if(save ==true) {
			
			String msg="Contact Saved Successfully";
			
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		} else {
			
			String msg="Contact Not Saved Successfully";

			
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		
	}
	
}

}