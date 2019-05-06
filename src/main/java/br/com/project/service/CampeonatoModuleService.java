package br.com.project.service;

public interface CampeonatoModuleService {

	void criarGrupoCampeonato(Integer idCampeonato);

	void criarPlayoffCampeonato(Integer idCampeonato, Integer idProximoGrupo, Integer limiteTimePorGrupo);

	void criarPlayoffSemisCampeonato(Integer idCampeonato, Integer idProximoGrupo, Integer limiteTimePorGrupo);

	void criarPlayoffFinalCampeonato(Integer idCampeonato, Integer idProximoGrupo, Integer limiteTimePorGrupo);

}
