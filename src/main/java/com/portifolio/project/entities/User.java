package com.portifolio.project.entities;

import java.io.Serializable;
import java.util.Objects;

//implements Serializable é a interface para o objeto trafegar na rede, gravar em arquivos

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private String password;
	
	//construtor vazio por estar usando framework
	
	public User() {
		
	}

	public User(Long id, String name, String email, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//hashcode apenas para o id comparar os IDS!

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//equals para comparar os ids
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
