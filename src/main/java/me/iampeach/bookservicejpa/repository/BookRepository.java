package me.iampeach.bookservicejpa.repository;

import me.iampeach.bookservicejpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
