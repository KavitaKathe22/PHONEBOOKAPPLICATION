package com.BikkadIt.phonebookApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.phonebookApplication.model.Contact;
@Repository
public interface ContactRepository extends  JpaRepository<Contact,Serializable> {

}
