package semicolon.africa.jijiMoji.services;

import semicolon.africa.jijiMoji.dtos.requests.RegisterListerRequest;
import semicolon.africa.jijiMoji.dtos.responses.RegisterListerResponse;

public interface ListerService {
    public RegisterListerResponse registerLister(RegisterListerRequest request);
}
