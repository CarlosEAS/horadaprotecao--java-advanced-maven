package br.com.fiap.horadaprotecao.repository;


import br.com.fiap.horadaprotecao.entity.FloodZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FloodZoneRepository extends JpaRepository<FloodZone, UUID> {
    Optional<FloodZone> findByUuid(UUID uuid);
}
