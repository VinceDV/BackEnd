package com.example.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import com.example.model.Citta;
import com.example.model.Edificio;
import com.example.model.Postazione;
import com.example.utils.TipoPostazione;
import com.example.model.User;
import com.example.repository.CittaRepository;
import com.example.repository.EdificioRepository;
import com.example.repository.PostazioneRepository;
import com.example.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppStartupRunner implements CommandLineRunner {

	@Autowired
	private CittaRepository cittaRepository;

	@Autowired
	private EdificioRepository edificioRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private PostazioneRepository postazioneRepository;

	@Override
	public void run(String... args) throws Exception {

		if (cittaRepository.count() == 0) {

			Citta initCitta = initCitta();
			List<Edificio> edificioList = initEdificio(initCitta);
			List<Postazione> postazioneList = initPostazione(edificioList);
			
			

		}

	}
	

	private List<Postazione> initPostazione(List<Edificio> edificioList) {
		List<Postazione> result = new ArrayList<Postazione>();
		
		for (Edificio ed : edificioList) {
			
			for (int i=1;i<4;i++) {
				Postazione post = new Postazione();
				post.setCodice("P_"+i+"_"+ed.getNome());
				post.setDescrizione("Postazione " + post.getCodice());
				post.setEdificio(ed);
				post.setNumeroMassimoOccupanti(i);
				post.setTipo(TipoPostazione.PRIVATO);
				postazioneRepository.save(post);
				log.info("Saved Postazione: {}", post.getCodice());
				result.add(post);

			}
			
			
		}
		
		return result;
	}


	private List<Edificio> initEdificio(Citta initCitta) {
		List<Edificio> lista = new ArrayList<Edificio>();

		Edificio edificio = new Edificio();
		edificio.setCitta(initCitta);
		edificio.setIndirizzo("Via Nazionale, 6");
		edificio.setNome("Sede Centrale - Roma");
		edificioRepository.save(edificio);
		lista.add(edificio);
		log.info("Saved Edificio: {}", edificio.getNome());

		edificio = new Edificio();
		edificio.setCitta(initCitta);
		edificio.setIndirizzo("Via Ponzio, 1");
		edificio.setNome("Sede Distaccata - Roma");
		edificioRepository.save(edificio);
		lista.add(edificio);
		log.info("Saved Edificio: {}", edificio.getNome());

		return lista;

	}

	private Citta initCitta() {
		Citta citta = new Citta();
		citta.setNome("Roma");
		cittaRepository.save(citta);
		log.info("Saved Citta: {}", citta.getNome());
		return citta;

	}
}