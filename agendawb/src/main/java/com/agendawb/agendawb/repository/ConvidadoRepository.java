package com.agendawb.agendawb.repository;

import org.springframework.data.repository.CrudRepository;

import com.agendawb.agendawb.models.Convidado;
import com.agendawb.agendawb.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
