package com.guestbook.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guestbook.entity.GuestBook;
import com.guestbook.repositories.GuestBookRepository;


@Service
public class GuestBookService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GuestBookService.class);
	
	@Autowired
	private GuestBookRepository guestBookRepository;
	
	public GuestBook save(GuestBook guestBook) {
		LOGGER.info("GuestBookService:::save:::Method Start End");
		return guestBookRepository.save(guestBook);
	}
	
	public Optional<GuestBook> get(Long guestBookId) {
		LOGGER.info("GuestBookService:::get:::Method Start End");
		//GuestBook guestBook = (GuestBook)guestBookRepository.findById(guestBookId).get();
		return guestBookRepository.findById(guestBookId);
	}
	
	public List<GuestBook> getAll() {
		LOGGER.info("GuestBookService:::getAll:::Method Start End");
		return (List<GuestBook>) guestBookRepository.findAll();
	}
	
	public GuestBook update(GuestBook guestBook) {
		LOGGER.info("GuestBookService:::update:::Method Start End");
		return guestBookRepository.save(guestBook);
	}
	
	public void delete(Long guestBookId) {
		LOGGER.info("GuestBookService:::delete:::Method Start End");
		guestBookRepository.deleteById(guestBookId);
	}

}
