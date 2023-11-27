package com.careerit.springcore.cbook;

import com.careerit.springcore.cbook.domain.Contact;
import com.careerit.springcore.cbook.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.cbook")
public class CbookApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CbookApplication.class);
        ContactService contactService = context.getBean(ContactService.class);

        // TODO: Add contact
      /*  Contact contact = new Contact();
        contact.setName("Manoj PVN");
        contact.setEmail("manoj.pvn@gmail.com");
        contact.setMobile("9876543211");
        Contact savedContact = contactService.addContact(contact);
        System.out.println("Contact saved with id : " + savedContact.getId());*/

        // TODO: Update contact
       /* Contact contact = new Contact();
        contact.setId(3L);
        contact.setName("Manoj Kumar PVN");
        contact.setEmail("manojkumar.pvn@gmail.com");
        contact.setMobile("9876543211");
        Contact updateContact = contactService.updateContact(contact);*/
        // TODO: Remove contact
        //contactService.removeContact(1L);
        // TODO: Get contact by id
       /* Contact contact = contactService.getContact(2L);
        System.out.println(contact.getId());
        System.out.println(contact.getName());
        System.out.println(contact.getEmail());
        System.out.println(contact.getMobile());*/
        // TODO: Search contact by name
         contactService.search("man").forEach(ele->{
             System.out.println(ele.getId());
             System.out.println(ele.getName());
             System.out.println(ele.getEmail());
             System.out.println(ele.getMobile());
         });
        System.out.println("---------------------------------------------------");
        // TODO: Get all contacts
        contactService.getContacts().forEach(ele->{
            System.out.println(ele.getId());
            System.out.println(ele.getName());
            System.out.println(ele.getEmail());
            System.out.println(ele.getMobile());
        });


    }
}
