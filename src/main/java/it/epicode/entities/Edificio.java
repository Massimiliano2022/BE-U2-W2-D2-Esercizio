package it.epicode.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Edificio {

	private String nome;
	private String indirizzo;
	private String citta;
}
