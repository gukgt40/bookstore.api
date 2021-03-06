package com.Mclovinbookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {

	private Integer id;
	
	private String name;
	
	private String descriçao;
    
	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	
	
	
	
	
	}

	public Categoria(Integer id, String name, String descriçao) {
		super();
		this.id = id;
		this.name = name;
		this.descriçao = descriçao;
	
	
	
	
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
		
		
		
		
		
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
	



}