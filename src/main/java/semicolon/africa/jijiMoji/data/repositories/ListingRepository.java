package semicolon.africa.jijiMoji.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import semicolon.africa.jijiMoji.data.models.Listing;

@Repository
public interface ListingRepository extends MongoRepository<Listing, String> {

}
