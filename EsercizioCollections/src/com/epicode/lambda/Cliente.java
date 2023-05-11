package com.epicode.lambda;


import com.epicode.lambda.MainProject;

public class Cliente {
	//Logger log = LoggerFactory.getLogger(MainProject.class);

	long id;
	String nome;
	int tier;
	
	public Cliente(long id, String nome, int tier) {
		super();
		this.id = id;
		this.nome = nome;
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", tier=" + tier + "]";
	}

}