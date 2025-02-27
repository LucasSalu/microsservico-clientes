package io.github.microsservicos.msclientes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.microsservicos.msclientes.domain.Cliente;
import io.github.microsservicos.msclientes.infra.repository.ClienteRepository;
import jakarta.transaction.Transactional;

public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Transactional
	public Cliente save(Cliente cliente) {
		return repository.save(cliente);
	}
	
	@Transactional
	public Optional<Cliente> save(String cpf) {
		return repository.findByCpf(cliente);
	}
	
	
}
