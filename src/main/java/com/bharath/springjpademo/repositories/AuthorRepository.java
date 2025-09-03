package com.bharath.springjpademo.repositories;

import com.bharath.springjpademo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
