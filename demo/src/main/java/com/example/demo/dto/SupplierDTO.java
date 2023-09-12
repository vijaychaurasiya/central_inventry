package com.example.demo.dto;

import org.springframework.stereotype.Component;

@Component
public class SupplierDTO {
	    private String firstName;
		private String lastName;
		private String baseUrl;
		private String consumerKey;
		private String consumerSecret;
		private Integer phone;
	    private String email;
	    private String password;
	    
	    public SupplierDTO() {
	    	
	    }
	 
		public SupplierDTO(String firstName, String lastName, String baseUrl, String consumerKey, String consumerSecret,
				Integer phone, String email, String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.baseUrl = baseUrl;
			this.consumerKey = consumerKey;
			this.consumerSecret = consumerSecret;
			this.phone = phone;
			this.email = email;
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getBaseUrl() {
			return baseUrl;
		}
		public void setBaseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
		}
		public String getConsumerKey() {
			return consumerKey;
		}
		public void setConsumerKey(String consumerKey) {
			this.consumerKey = consumerKey;
		}
		public String getConsumerSecret() {
			return consumerSecret;
		}
		public void setConsumerSecret(String consumerSecret) {
			this.consumerSecret = consumerSecret;
		}

		public Integer getPhone() {
			return phone;
		}
		public void setPhone(Integer phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Supplier [firstName=" + firstName + ", lastName=" + lastName + ", baseUrl=" + baseUrl
					+ ", consumerKey=" + consumerKey + ", consumerSecret=" + consumerSecret + ", phone=" + phone
					+ ", email=" + email + ", password=" + password + "]";
		}
     
}
