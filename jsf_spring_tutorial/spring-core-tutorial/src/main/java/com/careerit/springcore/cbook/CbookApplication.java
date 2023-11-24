package com.careerit.springcore.cbook;

import com.careerit.springcore.cbook.domain.Contact;
import com.careerit.springcore.cbook.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.cbook")
public class CbookApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContactService contactService = context.getBean(ContactService.class);

        // TODO: Add contact
        Contact contact = new Contact();
        contact.setName("Krish");
        contact.setEmail("krish@gmail.com");
        contact.setMobile("9876543210");
        Contact savedContact = contactService.addContact(contact);
        System.out.println("Contact saved with id : " + savedContact.getId());

        // TODO: Update contact

        // TODO: Remove contact

        // TODO: Get contact by id

        // TODO: Search contact by name

        // TODO: Get all contacts



    }
}
