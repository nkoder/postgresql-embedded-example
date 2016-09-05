package pl.nkoder.examples.postgresql.embedded;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingsRepository extends CrudRepository<Thing, Integer> {
}
