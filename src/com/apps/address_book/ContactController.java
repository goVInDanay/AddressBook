package com.apps.address_book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	private final ContactService service;

	public ContactController(ContactService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Contacts> addContact(@RequestBody Contacts contact) {
		service.addContact(contact);
		return ResponseEntity.status(HttpStatus.CREATED).body(contact);
	}

	@GetMapping
	public ResponseEntity<?> viewContact() {
		Contacts contact = service.getContact();
		if (contact == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No contact found");
		}
		return ResponseEntity.ok(contact);
	}
}
