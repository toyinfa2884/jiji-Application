package semicolon.africa.jijiMoji.data.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import semicolon.africa.jijiMoji.data.models.Lister;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataMongoTest
public class ListerRepositoryTest {
    @Autowired
    private ListerRepository listerRepository;

    @Test
    public void repositorySaveTest() {
        Lister lister = new Lister();
        lister.setFullName("Bolu Ola");
        lister.setEmail("ola@gmail.com");
        lister.setLocation("Sabo");
        lister.setPhoneNumber("0806683018");
        Lister savedLister = listerRepository.save(lister);
        assertEquals("Bolu Ola", savedLister.getFullName());
        assertNotNull(savedLister.getId());
    }
}
