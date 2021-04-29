package com.agendawb.agendawb.repository;

import org.springframework.data.repository.CrudRepository;

import com.agendawb.agendawb.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
