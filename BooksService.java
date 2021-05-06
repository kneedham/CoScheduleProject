/**
 * 
 */
package com.example.coschedule;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kimmie Needham
 *
 */
@Service
public class BooksService {
	private final String apiKey = "kdG3EvWKJxHsgMV6rJDQcK8ySEGRYBV6";
	private RestTemplate restTemplate;
	
	public BooksService() {
		restTemplate = new RestTemplate();
	}
	
	/*
	 * Requests and returns list of bestseller lists in JSON format
	 */
	@SuppressWarnings("rawtypes")
	public Map getBestsellersLists() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(header);
		ResponseEntity<Map> entity = restTemplate.exchange("https://api.nytimes.com/svc/books/v3//lists/names.json?api-key=" + apiKey, 
				HttpMethod.GET, requestEntity, Map.class);
		
		if(entity.getStatusCode() == HttpStatus.OK) {
			return entity.getBody();
		}

	return null;
	}
	
	/*
	 * Requests and returns Bestseller list in JSON format
	 */
	public Map findBestsellersList(String listName) {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(header);
		ResponseEntity<Map> entity = restTemplate.exchange("https://api.nytimes.com/svc/books/v3/lists/current/" + listName + ".json?api-key=" + apiKey, 
				HttpMethod.GET, requestEntity, Map.class);
		
		if(entity.getStatusCode() == HttpStatus.OK) {
			return entity.getBody();
		}

	return null;
	}
	
	/*
	 * Requests and returns reviews of books by a specific author in JSON format
	 */
	public Map findAuthor(String authName) {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(header);
		ResponseEntity<Map> entity = restTemplate.exchange("https://api.nytimes.com/svc/books/v3/reviews.json?author=" + authName + "&api-key=" + apiKey, 
				HttpMethod.GET, requestEntity, Map.class);
		if(entity.getStatusCode() == HttpStatus.OK) {
			return entity.getBody();
		}
	return null;
	}
}