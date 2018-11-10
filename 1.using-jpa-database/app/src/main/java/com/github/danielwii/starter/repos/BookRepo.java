package com.github.danielwii.starter.repos;

import com.github.danielwii.starter.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
