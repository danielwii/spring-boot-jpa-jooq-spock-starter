package com.github.danielwii.starter.repos

import com.github.danielwii.starter.entities.Book
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import spock.lang.Specification

import javax.annotation.Resource

@DataJpaTest
class BookRepoSpec extends Specification {

    @Resource
    BookRepo bookRepo

    def setup() {
        bookRepo.save(new Book(title: 'hello kitty'))
    }

    def "findAll"() {
        when:
        def books = bookRepo.findAll()

        then:
        books.size() == 1
    }

}
