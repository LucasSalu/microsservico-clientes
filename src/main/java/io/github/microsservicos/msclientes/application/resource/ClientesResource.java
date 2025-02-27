package io.github.microsservicos.msclientes.application.resource;

import io.github.microsservicos.msclientes.application.resource.representation.ClienteSaveRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClientesResource {

	@GetMapping
	public String status() {
		return "ok";
	}

	@PostMapping
	public ResponseEntity save(@RequestBody ClienteSaveRequest clienteSaveRequest){

	}
}
