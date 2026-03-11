package com.apps.address_book;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		System.out.println("\nContact Created:");
		System.out.println(contact);
		sc.close();
	}
}
