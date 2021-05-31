package org.digitalse.TextExtractSvc.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preprocessing")
public class TextPreProcessing {
		
	@GetMapping
	public String textProcess() {
		return "Texto pré processado";
	}
	@GetMapping("/texto")
	public String textProcess2() {
		return "Texto pré processado 2";
	}
}
