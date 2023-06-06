package it.epicode.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Utente {

	private String username;
	private String nomeCompleto;
	private String email;
}
