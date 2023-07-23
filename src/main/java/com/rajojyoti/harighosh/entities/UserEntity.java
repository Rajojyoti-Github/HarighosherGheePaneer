/**
 * 
 */
package com.rajojyoti.harighosh.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userid;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String emailaddress;
	
	private String phonenumber;
	
	private String address;
	
	private String bloodgroup;
	
	

	/**
	 * @return the userid
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
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


	public UserEntity(Integer userid, String name, String username, String password, String emailaddress,
			String phonenumber, String address, String bloodgroup) {
		super();
		this.userid = userid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.address = address;
		this.bloodgroup = bloodgroup;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", emailaddress=" + emailaddress + ", phonenumber=" + phonenumber + ", address=" + address
				+ ", bloodgroup=" + bloodgroup + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bloodgroup, emailaddress, name, password, phonenumber, userid, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(address, other.address) && Objects.equals(bloodgroup, other.bloodgroup)
				&& Objects.equals(emailaddress, other.emailaddress) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phonenumber, other.phonenumber)
				&& Objects.equals(userid, other.userid) && Objects.equals(username, other.username);
	}
	
	

}
