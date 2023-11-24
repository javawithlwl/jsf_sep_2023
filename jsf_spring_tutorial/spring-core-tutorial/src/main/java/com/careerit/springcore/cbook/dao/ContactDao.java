package com.careerit.springcore.cbook.dao;

import com.careerit.springcore.cbook.domain.Contact;

import java.util.List;

public interface ContactDao {

    Contact insertContact(Contact contact);
    Contact updateContact(Contact contact);
    boolean deleteContact(long id);
    Contact selectContact(long id);
    List<Contact> search(String str);
    List<Contact> selectContacts();


}
