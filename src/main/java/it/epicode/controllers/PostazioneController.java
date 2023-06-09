package it.epicode.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.entities.Edificio;
import it.epicode.entities.Postazione;
import it.epicode.entities.TipoPostazione;

@RestController
@RequestMapping("/prenotazionepostazioni")
public class PostazioneController {

	@GetMapping("/rules/{language}")
	public String getRules(@PathVariable String language) {
		if (language.equals("it")) {
			return "Le regole per prenotare una postazione sono... blablabla";
		} else if (language.equals("en")) {
			return "The rules for booking a seat are... blablabla";
		} else {
			return "Language not supported";
		}
	}

	@GetMapping("/postazioni")
	public List<Postazione> getPostazioni() {
		List<Postazione> listaPostazioni = new ArrayList<Postazione>();
		listaPostazioni.add(new Postazione(1, "Stupenda", TipoPostazione.OPEN_SPACE, true, 10,
				new Edificio("Centro Piero della Francesca", "Corso Svizzera, 185", "Torino")));
		listaPostazioni.add(new Postazione(2, "Stupenda", TipoPostazione.PRIVATO, true, 3,
				new Edificio("Centro Piero della Francesca", "Corso Svizzera, 185", "Torino")));
		listaPostazioni.add(new Postazione(3, "Stupenda", TipoPostazione.SALA_RIUNIONI, true, 30,
				new Edificio("Centro Piero della Francesca", "Corso Svizzera, 185", "Torino")));
		return listaPostazioni;
	}

	@GetMapping("/postazioni/")
	public Optional<Postazione> getPostazioneByTipoPostazione(@RequestParam(required = true) String tipoPostazione,
			@RequestParam(required = true) String citta) {
		List<Postazione> listaPostazioni = getPostazioni();
		Postazione p = null;

		for (Postazione postazione : listaPostazioni) {
			if (postazione.getTipoPostazione().toString().equals(tipoPostazione)
					&& postazione.getEdificio().getCitta().equals(citta)) {
				p = postazione;
			}
		}
		return Optional.ofNullable(p);
	}
}
