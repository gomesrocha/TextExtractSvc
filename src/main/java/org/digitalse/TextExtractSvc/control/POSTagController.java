package org.digitalse.TextExtractSvc.control;

import java.io.IOException;

import org.digitalse.TextExtractSvc.dto.POSTaggingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postag")
public class POSTagController {
	
	@GetMapping
	public ResponseEntity<POSTaggingDto> TokenizeText(@RequestParam String texto) throws IOException {
		return ResponseEntity.ok(new POSTaggingDto(texto));
		
	}
}
