/*
package com.mapstruct.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/contacts/")
public class ContactController {
    private static final List<Contact> contacts = Lists.newArrayList(
            Contact.builder().name("Bruno Krebs").phone("+5551987654321").build(),
            Contact.builder().name("John Doe").phone("+5551888884444").build()
    );

    @GetMapping
    public List<Contact> getContacts() {
        return contacts;
    }

    @PostMapping
    public void addContact(@RequestBody Contact contact) {
//        contacts.add(contact);
    }
}*/
