package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Class;
import org.ashina.mycontact.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CLassServicelmpl implements ClassService  {
	 @Autowired
	    private ClassRepository contactRepository;

	    @Override
	    public Iterable<Class> findAll() {
	        return contactRepository.findAll();
	    }

	    @Override
	    public List<Class> search(String term) {
	        return contactRepository.findByNameContaining(term);
	    }

	    @Override
	    public Optional<Class> findOne(String id) {
	        return contactRepository.findById(id);
	    }

	    @Override
	    public void save(Class contact) {
	        contactRepository.save(contact);
	    }

	    @Override
	    public void delete(String id) {
	        contactRepository.deleteById(id);
	    }
	}
