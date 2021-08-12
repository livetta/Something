package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company{


	private String bs;

	private String catchPhrase;

	private String name;

	public String getBs(){
		return bs;
	}

	public String getCatchPhrase(){
		return catchPhrase;
	}

	public String getName(){
		return name;
	}
}
