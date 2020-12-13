package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.project.entity.PlayoffEntity;

@Repository
public interface PlayoffRepository extends JpaRepository<PlayoffEntity, Long> {

}
