package com.bharath.springjpademo.repositories;

import com.bharath.springjpademo.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

	//using named query
	@Transactional
	@Modifying
	List<Author> findByNamedQuery(@Param("age") int age);

	@Transactional
	@Modifying
	void updateByNamedQuery(@Param("age") int age, @Param("id") int id);

	@Modifying
	@Transactional
	@Query("update Author a set a.age=:age where a.Id=:id")
	void updateAuthor(int age,int id);

	@Modifying
	@Transactional
	@Query("update Author a set a.age=:age")
	void updateAllAuthorsAge(int age);

	//select * from author where first_name = 'ali'
	List<Author> findAllByFirstName(String fname);

	//select * from author where first_name = 'ali' (case insensitive)
	List<Author> findAllByFirstNameIgnoreCase(String fname);

	//select * from author where first_name like '%ali%' (case-insensitive)
	List<Author> findAllByFirstNameContainingIgnoreCase(String fname);

	//select * from author where first_name like 'ali%' (case-insensitive)
	List<Author> findAllByFirstNameStartsWithIgnoreCase(String fname);

	//select * from author where first_name like '%ali' (case-insensitive)
	List <Author> findAllByFirstNameEndsWithIgnoreCase(String fname);

	//select * from author where first_name in ('ali', 'john', 'mike') (case-insensitive)
	List<Author> findAllByFirstNameInIgnoreCase(String... fnames);
}
