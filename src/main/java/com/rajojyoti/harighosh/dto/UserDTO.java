package com.rajojyoti.harighosh.dto;

import java.util.Objects;

public class UserDTO {
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String emailaddress;
	
	private String phonenumber;
	
	private String address;
	
	private String bloodgroup;
	
	private String timestamp;
	
	private String updatedby;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the updatedby
	 */
	public String getUpdatedby() {
		return updatedby;
	}

	/**
	 * @param updatedby the updatedby to set
	 */
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public UserDTO(String name, String username, String password, String emailaddress, String phonenumber,
			String address, String bloodgroup, String timestamp, String updatedby) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.timestamp = timestamp;
		this.updatedby = updatedby;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bloodgroup, emailaddress, name, password, phonenumber, timestamp, updatedby,
				username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(bloodgroup, other.bloodgroup)
				&& Objects.equals(emailaddress, other.emailaddress) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phonenumber, other.phonenumber)
				&& Objects.equals(timestamp, other.timestamp) && Objects.equals(updatedby, other.updatedby)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", username=" + username + ", password=" + password + ", emailaddress="
				+ emailaddress + ", phonenumber=" + phonenumber + ", address=" + address + ", bloodgroup=" + bloodgroup
				+ ", timestamp=" + timestamp + ", updatedby=" + updatedby + "]";
	}
	
	

}
