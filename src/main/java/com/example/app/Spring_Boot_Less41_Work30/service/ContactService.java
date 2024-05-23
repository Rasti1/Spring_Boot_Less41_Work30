package com.example.app.Spring_Boot_Less41_Work30.service;

import com.example.app.Spring_Boot_Less41_Work30.entity.Contact;
import com.example.app.Spring_Boot_Less41_Work30.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public List<Contact> getAllContacts() {
        Iterable<Contact> iterable = repository.findAll();
        List<Contact> list = StreamSupport.stream(iterable.spliterator(), false)
                .toList();
        return new ArrayList<>(list);
    }
}
