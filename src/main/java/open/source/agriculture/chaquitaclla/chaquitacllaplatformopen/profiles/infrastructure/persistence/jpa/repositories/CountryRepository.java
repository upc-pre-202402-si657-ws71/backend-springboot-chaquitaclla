package open.source.agriculture.chaquitaclla.chaquitacllaplatformopen.profiles.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
    @Override
    Optional<Country> findById(Long aLong);
}
