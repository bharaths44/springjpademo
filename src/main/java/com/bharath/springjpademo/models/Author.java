package com.bharath.springjpademo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@NamedQuery(name = "Author.findByNamedQuery", query = "select a from Author a where a.age>=20")
//@NamedQuery(name = "Author.updateByNamedQuery", query = "update Author a set a.age=:age where a.id =:id")

@NamedQueries(
		{
				@NamedQuery(
						name = "Author.findByNamedQuery",
						query = "select a from Author a where a.age>=20"
				),
				@NamedQuery(
						name = "Author.updateByNamedQuery",
						query = "update Author a set a.age=:age where a.id =:id"
				)

		}
)
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
