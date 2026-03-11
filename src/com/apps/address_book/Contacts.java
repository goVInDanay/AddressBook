package com.apps.address_book;

public class Contacts {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private Integer zip;
	private String phoneNumber;
	private String email;

	private Contacts(ContactBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.address = builder.address;
		this.city = builder.city;
		this.state = builder.state;
		this.zip = builder.zip;
		this.phoneNumber = builder.phoneNumber;
		this.email = builder.email;
	}

	public static class ContactBuilder {
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private Integer zip;
		private String phoneNumber;
		private String email;

		public ContactBuilder(String firstName, String address, String city, String state, String phoneNumber) {
			this.firstName = firstName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.phoneNumber = phoneNumber;
		}

		public ContactBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public ContactBuilder setZip(Integer zip) {
			this.zip = zip;
			return this;
		}

		public ContactBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Contacts build() {
			return new Contacts(this);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public Integer getZip() {
		return zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

}
