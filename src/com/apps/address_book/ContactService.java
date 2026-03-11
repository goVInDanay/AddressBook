package com.apps.address_book;

import org.springframework.stereotype.Service;

@Service
public class ContactService {
	private Contacts contact;

	public void addContact(Contacts contact) {
		this.contact = contact;
		System.out.println("Added contact successfully");
	}

	public Contacts getContact() {
		return contact;
	}
}
