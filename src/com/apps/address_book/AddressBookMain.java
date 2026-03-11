package com.apps.address_book;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook("Address Book");
		Contacts contact = null;

		System.out.println("Add a new Contact");
		System.out.println("First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Last Name(optional): ");
		String lastName = sc.nextLine();
		System.out.print("Address: ");
		String address = sc.nextLine();
		System.out.print("City: ");
		String city = sc.nextLine();
		System.out.print("State: ");
		String state = sc.nextLine();
		System.out.print("Zip (optional): ");
		String zipInput = sc.nextLine();
		int zip = zipInput.isEmpty() ? 0 : Integer.parseInt(zipInput);
		System.out.print("Phone Number: ");
		String phoneNumber = sc.nextLine();
		System.out.print("Email (optional): ");
		String email = sc.nextLine();

		Contacts.ContactBuilder builder = new Contacts.ContactBuilder(firstName, address, city, state, phoneNumber);
		if (!lastName.isEmpty()) {
			builder.setLastName(lastName);
		}
		if (zip != 0) {
			builder.setZip(zip);
		}
		if (!email.isEmpty()) {
			builder.setEmail(email);
		}
		contact = builder.build();
		addressBook.addContact(contact);

		System.out.println("\nUpdate contact");
		System.out.println("Enter first name or last name to find contact");
		String name = sc.nextLine();
		Contacts updatedContact = null;

		System.out.println("Add a new Contact");
		System.out.println("First Name: ");
		firstName = sc.nextLine();
		System.out.println("Last Name(optional): ");
		lastName = sc.nextLine();
		System.out.print("Address: ");
		address = sc.nextLine();
		System.out.print("City: ");
		city = sc.nextLine();
		System.out.print("State: ");
		state = sc.nextLine();
		System.out.print("Zip (optional): ");
		zipInput = sc.nextLine();
		zip = zipInput.isEmpty() ? 0 : Integer.parseInt(zipInput);
		System.out.print("Phone Number: ");
		phoneNumber = sc.nextLine();
		System.out.print("Email (optional): ");
		email = sc.nextLine();

		Contacts.ContactBuilder updatedBuilder = new Contacts.ContactBuilder(firstName, address, city, state,
				phoneNumber);
		if (!lastName.isEmpty()) {
			updatedBuilder.setLastName(lastName);
		}
		if (zip != 0) {
			updatedBuilder.setZip(zip);
		}
		if (!email.isEmpty()) {
			updatedBuilder.setEmail(email);
		}

		updatedContact = updatedBuilder.build();
		if (addressBook.editContact(name, updatedContact)) {
			System.out.println("\nUpdated Contact");
		} else {
			System.out.println("\nContact not found");
		}

		System.out.println("\nDelete Contact");
		System.out.println("Enter first name or last name to delete contact");
		String name2 = sc.nextLine();
		if (addressBook.deleteContact(name2)) {
			System.out.println("\nDeleted Contact");
		} else {
			System.out.println("\nContact not found");
		}

		sc.close();
	}
}
