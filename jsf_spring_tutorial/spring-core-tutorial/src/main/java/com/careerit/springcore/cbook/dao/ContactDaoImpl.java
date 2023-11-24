package com.careerit.springcore.cbook.dao;

import com.careerit.springcore.cbook.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao{

    private final JdbcTemplate jdbcTemplate;
    @Override
    public Contact insertContact(Contact contact) {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }

    @Override
    public boolean deleteContact(long id) {
        return false;
    }

    @Override
    public Contact selectContact(long id) {
        return null;
    }

    @Override
    public List<Contact> search(String str) {
        return null;
    }

    @Override
    public List<Contact> selectContacts() {
        return null;
    }
}
