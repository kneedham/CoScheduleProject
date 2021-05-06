/**
 * 
 */
package com.example.coschedule.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.coschedule.BooksService;

/*
 * Gives the application the ability to interact with the NYT Books API
 */
@RestController
public class BookController {
	
	@Autowired
	private BooksService booksService;

//	@SuppressWarnings("rawtypes")
//	@GetMapping("/lists")
//	public Map getBestsellerLists() {
//		return booksService.getBestsellersLists();
//	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/authors/{authName}")
	public Map search(@PathVariable String authName) {
		return booksService.findAuthor(authName);
	}
	
}