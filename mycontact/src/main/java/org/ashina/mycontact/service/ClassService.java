package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Class;
import java.util.List;
import java.util.Optional;

public interface ClassService {
	Iterable<Class> findAll();

    List<Class> search(String term);

    Optional<Class> findOne(String id);

    void save(Class contact);

    void delete(String id);
}
