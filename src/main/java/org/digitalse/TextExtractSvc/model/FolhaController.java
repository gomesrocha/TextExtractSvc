package org.digitalse.TextExtractSvc.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.digitalse.TextExtractSvc.dto.FolhaDto;
@RestController
@RequestMapping("/folha")
public class FolhaController {
	
	
	@GetMapping
	public ResponseEntity<FolhaDto> calcular(@RequestParam float salario){
		return ResponseEntity.ok(new FolhaDto(salario));
	}
	

}
