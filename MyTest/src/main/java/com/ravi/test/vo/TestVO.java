package com.ravi.test.vo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonInclude(JsonInclude.Include.ALWAYS)
public class TestVO {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@JsonProperty("name")
	private String name;

	@JsonProperty("address")
	private List<String> address;

	@JsonProperty("age")
	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
