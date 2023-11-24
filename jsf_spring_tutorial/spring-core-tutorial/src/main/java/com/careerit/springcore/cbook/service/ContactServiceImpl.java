package com.careerit.springcore.cbook.service;

import com.careerit.springcore.cbook.domain.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Override
    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }

    @Override
    public boolean removeContact(long id) {
        return false;
    }

    @Override
    public Contact getContact(long id) {
        return null;
    }

    @Override
    public List<Contact> search(String str) {
        return null;
    }

    @Override
    public List<Contact> getContacts() {
        return null;
    }
}
