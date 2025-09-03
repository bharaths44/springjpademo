package com.bharath.springjpademo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// @Table(name = "author_tbl")
public class Author extends BaseEntity {


	@Column(name = "f_name")
	private String firstName;

	private String lastName;

	@Column(unique = true, nullable = false)
	private String email;

	private int age;

//	@Column(updatable = false, nullable = false)
//	private LocalDateTime createdAt;
//
//	@Column(insertable = false)
//	private LocalDateTime updatedAt;


	@ManyToMany(mappedBy = "authors")
	private List<Course> courses;

}
