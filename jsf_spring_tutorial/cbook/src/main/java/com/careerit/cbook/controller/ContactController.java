package com.careerit.cbook.controller;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

        private final ContactService contactService;

        @PostMapping
        public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
            Contact savedContact = contactService.addContact(contact);
            return ResponseEntity.ok(savedContact);
        }
        @GetMapping("/all")
        public ResponseEntity<List<Contact>> getContacts(){
            List<Contact> contacts = contactService.getContacts();
            return ResponseEntity.ok(contacts);
        }
        @GetMapping("/by-id/{id}")
        public ResponseEntity<Contact> getContact(@PathVariable("id") Long contactId){
            Contact contact = contactService.getContact(contactId);
            return ResponseEntity.ok(contact);
        }

        @PutMapping
        public ResponseEntity<Contact> updateContact(@RequestBody Contact contact){
            Contact updatedContact = contactService.updateContact(contact);
            return ResponseEntity.ok(updatedContact);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Boolean> deleteContact(@PathVariable("id") Long contactId){
            boolean isDeleted = contactService.removeContact(contactId);
            return ResponseEntity.ok(isDeleted);
        }
        @GetMapping("/search")
        public ResponseEntity<List<Contact>> search(@RequestParam(name="str",defaultValue = "") String str){
            List<Contact> contacts = contactService.search(str);
            return ResponseEntity.ok(contacts);
        }

}
