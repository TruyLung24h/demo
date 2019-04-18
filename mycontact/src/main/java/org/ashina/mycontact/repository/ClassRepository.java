package org.ashina.mycontact.repository;

import org.ashina.mycontact.entity.Class;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends CrudRepository<Class, String>{
	List<Class> findByNameContaining(String term);

}
