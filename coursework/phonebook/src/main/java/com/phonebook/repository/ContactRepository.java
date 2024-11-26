package com.phonebook.repository;

import com.phonebook.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactRepository {
    private final List<Contact> contacts = new ArrayList<>();
    private int nextId = 1;

    public Contact addContact(String name, String phone, String email) {
        Contact contact = new Contact(nextId++, name, phone, email);
        contacts.add(contact);
        return contact;
    }

    public boolean deleteContact(int id) {
        return contacts.removeIf(contact -> contact.getId() == id);
    }

    public Optional<Contact> findContactById(int id) {
        return contacts.stream().filter(contact -> contact.getId() == id).findFirst();
    }

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }
}
