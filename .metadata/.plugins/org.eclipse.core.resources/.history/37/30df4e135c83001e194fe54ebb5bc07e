package org.dawin.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.dawin.service.DonateService;
import org.dawin.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/donate")
@Controller
public class DonateController {
	
	@Autowired
	DonateService service;
	
	@Autowired
	ExchangeService exservice;
	
	@GetMapping("/donate")
	public void donateList(Model model) {
		model.addAttribute("donateAmountList", service.getDonateList());
		model.addAttribute("lists", exservice.exchangeData());
	}
	
	@PostMapping("/donate")
	public String donate(@Valid Errors errors) throws IOException {
		// 처리 로직
		return "/donate";
	}

	@GetMapping("/payment")
	public void payment() {
		log.info("=== payment page 접속 중 ===");
	}

	@PostMapping("/payment")
	public String payment(@Valid Errors errors) throws IOException {
		// 처리 로직
		log.info("=== payment page 접속 중 ===");
		return "security/payment";
	}
	
	
}
