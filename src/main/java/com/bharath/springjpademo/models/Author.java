package com.bharath.springjpademo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
// @Table(name = "author_tbl")
public class Author {

	@Id
	@GeneratedValue
//			(strategy = GenerationType.SEQUENCE, generator = "author_sequence")
//	@SequenceGenerator(name = "author_sequence", sequenceName = "author_sequence", allocationSize = 1)
	private Integer Id;

	@Column(name = "f_name")
	private String firstName;

	private String lastName;

	@Column(unique = true, nullable = false)
	private String email;

	private int age;

	@Column(updatable = false, nullable = false)
	private LocalDateTime createdAt;

	@Column(insertable = false)
	private LocalDateTime updatedAt;


}
