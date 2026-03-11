package com.apps.address_book;

public class AddressBook {
	private String name;
	Contacts contact;

	public AddressBook(String name) {
		this.name = name;
	}

	public void addContact(Contacts contact) {
		this.contact = contact;
		System.out.println("Added contact " + contact);
	}

	public Contacts getContact() {
		return contact;
	}
}
