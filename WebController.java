package com.example.coschedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * Displays webpages by returning the names of html files
 */
@Controller
public class WebController {
	
	@RequestMapping("/")
    public String login(){
        return "login";
    }
	
	@RequestMapping("/lists")
	public String lists() {
		return "lists";
	}
	
}
