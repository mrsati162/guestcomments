package com.guestbook.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guestbook.entity.GuestBook;
import com.guestbook.service.GuestBookService;

@RestController
@RequestMapping("/guestbook")
public class GuestBookController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GuestBookController.class);
	
	@Autowired
	private GuestBookService guestBookService;
	
	@GetMapping
	public List<GuestBook> getAll(){
		LOGGER.info("GuestBookController:::getAll:::Method Start");
		return guestBookService.getAll();
	}

    @GetMapping("/get")
	public Optional<GuestBook> get(@RequestParam("id") Long id){
    	LOGGER.info("GuestBookController:::get:::Method Start");
		return guestBookService.get(id);
	}
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public GuestBook save(@RequestBody GuestBook guestBook) {
    	LOGGER.info("GuestBookController:::save:::Method Start");
    	guestBook.setTimestamp(new Date());
    	LOGGER.info("GuestBookController:::save:::Method End");
    	return guestBookService.save(guestBook);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public GuestBook update(@RequestBody GuestBook guestBook) {
    	LOGGER.info("GuestBookController:::save:::Method Start");
    	guestBook.setTimestamp(new Date());
    	LOGGER.info("GuestBookController:::save:::Method End");
    	return guestBookService.update(guestBook);
    }
    
    @DeleteMapping
    public void delete(@RequestParam("id") Long guestBookId) {
    	guestBookService.delete(guestBookId);
    }

}
