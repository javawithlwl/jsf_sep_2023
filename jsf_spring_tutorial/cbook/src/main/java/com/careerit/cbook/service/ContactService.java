package com.careerit.cbook.service;
import com.careerit.cbook.domain.Contact;
import java.util.List;

public interface ContactService {

        Contact addContact(Contact contact);
        Contact updateContact(Contact contact);
        boolean removeContact(Long id);
        Contact getContact(Long id);
        List<Contact> search(String str);
        List<Contact> getContacts();


}
