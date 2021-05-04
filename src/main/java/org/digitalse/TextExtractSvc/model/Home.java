package org.digitalse.TextExtractSvc.model;

import org.digitalse.TextExtractSvc.dto.FolhaDto;
import org.digitalse.TextExtractSvc.dto.TokenDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Extrator de texto e tokens";
	}
	/*
	 * @GetMapping
	public ResponseEntity<FolhaDto> calcular(@RequestParam float salario){
		return ResponseEntity.ok(new FolhaDto(salario));
	}
	
	 */
	@GetMapping("/extrator")
	public ResponseEntity<TokenDto> extrair(@RequestParam String texto){
		return ResponseEntity.ok(new TokenDto(texto));
	}
	
}
