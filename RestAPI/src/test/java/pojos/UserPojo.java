package pojos;

import org.checkerframework.checker.units.qual.A;

public class UserPojo
{

	private String website;
	private Address address;
	private String phone;
	private String name;
	private Company company;
	private int id;
	private String email;
	private String username;

	public UserPojo()
	{

	}

	public UserPojo(int id, String userName, String email, String website, Address address, Company company, String phone) {
		this.website = website;
		this.address = address;
		this.phone = phone;
		this.name = name;
		this.company = company;
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public String getWebsite(){
		return website;
	}

	public Address getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public Company getCompany(){
		return company;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}


}
