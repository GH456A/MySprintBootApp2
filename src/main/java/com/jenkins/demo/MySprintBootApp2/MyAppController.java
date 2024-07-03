package com.jenkins.demo.MySprintBootApp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myapp")
public class MyAppController {

	@GetMapping("/headline")
	@ResponseBody
	public String getLatestNewsHeadLines() {
		return "Six Flags, Cedar Fair merge in huge theme park deal";
	}
}
