package semicolon.africa.jijiMoji.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semicolon.africa.jijiMoji.data.models.Lister;
import semicolon.africa.jijiMoji.data.repositories.ListerRepository;
import semicolon.africa.jijiMoji.dtos.requests.RegisterListerRequest;
import semicolon.africa.jijiMoji.dtos.responses.RegisterListerResponse;
import semicolon.africa.jijiMoji.exceptions.DuplicateEmailException;
import semicolon.africa.jijiMoji.utils.ModelMapper;

import java.util.Optional;

@Service
public class ListerServiceImpl implements ListerService{
    @Autowired
    private ListerRepository listerRepository;
    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest request) {

            //validate user does not exist (email)
            // find lister by email, if present throw exception
            Optional<Lister> optionalLister = listerRepository.findListerByEmail(request.getEmail());
            if (optionalLister.isPresent()) throw new DuplicateEmailException(request.getEmail()+ "already exist");

            // create lister from request
            Lister lister = ModelMapper.map(request);
            // save lister
            Lister savedLister = listerRepository.save(lister);
            //create response from saved lister
            RegisterListerResponse response = ModelMapper.map(savedLister);
            //return response
            return response;

    }
}
