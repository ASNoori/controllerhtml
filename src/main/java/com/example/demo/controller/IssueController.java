package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.IssueReport;
@Controller
public class IssueController {
	@GetMapping("/issuereport")
	@ResponseBody()

	public String getreport(Model model)
	{
		 model.addAttribute("issuereport", new IssueReport());
		return "static/issuereport.html";
	}
	
@PostMapping("/issuereport")
@ResponseBody()
public String submitReport(IssueReport issueReport, Model model) 
{
	model.addAttribute("issuereport", new IssueReport());
    model.addAttribute("submitted", true);
	return "/issuereport_form";
	
}
@GetMapping("/issue")
@ResponseBody()
String getissue(Model model)
{
	return "/issuelist";
}
}
