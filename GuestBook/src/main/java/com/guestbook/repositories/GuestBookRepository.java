package com.guestbook.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.guestbook.entity.GuestBook;


@Repository
public interface GuestBookRepository extends PagingAndSortingRepository<GuestBook, Long>{

}
