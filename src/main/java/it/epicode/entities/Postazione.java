package it.epicode.entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Postazione {

	private int id;
	private String descrizione;
	private TipoPostazione tipoPostazione;
	private int numeroMassimo;
	private boolean libera;
	private Utente utente;
	private LocalDate dataPrenotazione;
	private Edificio edificio;

	public Postazione(int id, String descrizione, TipoPostazione tipoPostazione, boolean libera, int numeroMassimo,
			Edificio edificio) {
		setId(id);
		setDescrizione(descrizione);
		setTipoPostazione(tipoPostazione);
		setLibera(libera);
		setNumeroMassimo(numeroMassimo);
		setEdificio(edificio);
	}
}
