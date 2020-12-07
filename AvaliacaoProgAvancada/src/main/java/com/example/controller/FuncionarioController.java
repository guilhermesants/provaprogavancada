package com.example.controller;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Funcionario;

@RestController
public class FuncionarioController {

	@PostMapping("/funcionario/maiorsalario")
	public ResponseEntity<Object> postFuncionario(@RequestBody List<Funcionario> funcionarios)
	{
		List<Funcionario> listFuncionarios = funcionarios;
		
		Funcionario funcionario = FuncionarioMaiorSalario(listFuncionarios);
		
		return ResponseEntity.ok(funcionario);
	}
	
	private Funcionario FuncionarioMaiorSalario(List<Funcionario> listFuncionarios)
	{
		Funcionario funcionario = listFuncionarios.get(0);
		
		for (int i = 1; i < listFuncionarios.size(); i++)
		{
			if (listFuncionarios.get(i).getSalario() > funcionario.getSalario())
			{
				funcionario = listFuncionarios.get(i);
			}
			
		}
		return funcionario;
	}
	
}
