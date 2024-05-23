package com.example.app.Spring_Boot_Less41_Work30.repository;

import com.example.app.Spring_Boot_Less41_Work30.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
