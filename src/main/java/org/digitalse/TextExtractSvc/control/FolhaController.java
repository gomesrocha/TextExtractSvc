package org.digitalse.TextExtractSvc.control;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.digitalse.TextExtractSvc.dto.FolhaDto;
import org.digitalse.TextExtractSvc.dto.SalarioDto;
@RestController
@RequestMapping("/folha")
public class FolhaController {
	
	@GetMapping
	public ResponseEntity<FolhaDto> calcular(@RequestParam float salario){
		return ResponseEntity.ok(new FolhaDto(salario));
	}
	@PostMapping
	public ResponseEntity<FolhaDto> calcular2(@RequestBody SalarioDto salario){
		return ResponseEntity.ok(new FolhaDto(salario.getSalario()));
	}

}
