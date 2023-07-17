/**
 * 
 */
package com.rajojyoti.harighosh.entities;

import java.util.Objects;

/**
 * 
 */
public class User {
	
	private String username;
	
	private String emailaddress;
	
	private String phonenumber;
	
	private String address;
	
	private String bloodgroup;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the emailaddress
	 */
	public String getEmailaddress() {
		return emailaddress;
	}

	/**
	 * @param emailaddress the emailaddress to set
	 */
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the bloodgroup
	 */
	public String getBloodgroup() {
		return bloodgroup;
	}

	/**
	 * @param bloodgroup the bloodgroup to set
	 */
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public User(String username, String emailaddress, String phonenumber, String address, String bloodgroup) {
		super();
		this.username = username;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.address = address;
		this.bloodgroup = bloodgroup;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", emailaddress=" + emailaddress + ", phonenumber=" + phonenumber
				+ ", address=" + address + ", bloodgroup=" + bloodgroup + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bloodgroup, emailaddress, phonenumber, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(bloodgroup, other.bloodgroup)
				&& Objects.equals(emailaddress, other.emailaddress) && phonenumber == other.phonenumber
				&& Objects.equals(username, other.username);
	}
	
	

}
