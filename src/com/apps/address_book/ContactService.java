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

	public Contacts updateContact(Contacts updatedContact) {
		if (this.contact != null) {
			this.contact.setFirstName(updatedContact.getFirstName());
			this.contact.setLastName(updatedContact.getLastName());
			this.contact.setAddress(updatedContact.getAddress());
			this.contact.setCity(updatedContact.getCity());
			this.contact.setState(updatedContact.getState());
			this.contact.setZip(updatedContact.getZip());
			this.contact.setPhoneNumber(updatedContact.getPhoneNumber());
			this.contact.setEmail(updatedContact.getEmail());
		}
		return this.contact;
	}

	public boolean deleteContact() {
		if (this.contact != null) {
			this.contact = null;
			return true;
		}
		return false;
	}
}
