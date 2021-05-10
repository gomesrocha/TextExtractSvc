package org.digitalse.TextExtractSvc.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.digitalse.TextExtractSvc.dto.TokenDto;;

@RestController
@RequestMapping("/tokens")
public class TokenController {
	
	@GetMapping
	public ResponseEntity<TokenDto> TokenizeText(@RequestParam String texto) {
		return ResponseEntity.ok(new TokenDto(texto));
		
	}

}
