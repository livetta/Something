package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geo{

	private String lng;

	private String lat;

	public String getLng(){
		return lng;
	}

	public String getLat(){
		return lat;
	}
}
