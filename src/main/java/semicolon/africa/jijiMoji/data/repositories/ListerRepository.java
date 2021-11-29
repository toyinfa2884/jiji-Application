package semicolon.africa.jijiMoji.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import semicolon.africa.jijiMoji.data.models.Lister;

import java.util.Optional;

@Repository
public interface ListerRepository extends MongoRepository<Lister, String> {
    Optional<Lister> findListerByEmail(String email);
}
