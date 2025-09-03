package com.bharath.springjpademo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Author {

	@Id
	@GeneratedValue
//			(strategy = GenerationType.SEQUENCE, generator = "author_sequence")
//	@SequenceGenerator(name = "author_sequence", sequenceName = "author_sequence", allocationSize = 1)
	private Integer Id;

	private String firstName;

	private String lastName;

	private String email;

	private int age;


}
