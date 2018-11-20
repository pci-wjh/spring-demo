package com.pci.data.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Dog {
	@NotNull(message = "{Dog.id.non}")
	@Min(value = 1, message = "{Dog.age.lt1}")
	private Long id;
	@NotBlank(message = "{Dog.name.non}")
	private String name;
	@Min(value = 1, message = "{Dog.age.lt1}")
	private String age;

}
