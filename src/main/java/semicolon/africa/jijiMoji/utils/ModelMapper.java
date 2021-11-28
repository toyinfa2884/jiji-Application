package semicolon.africa.jijiMoji.utils;

import semicolon.africa.jijiMoji.data.models.Lister;
import semicolon.africa.jijiMoji.dtos.requests.RegisterListerRequest;
import semicolon.africa.jijiMoji.dtos.responses.RegisterListerResponse;

import java.time.format.DateTimeFormatter;

public class ModelMapper {
    public static Lister map(RegisterListerRequest request) {
        Lister lister = new Lister();
        lister.setEmail(request.getEmail());
        lister.setLocation(request.getLocation());
        lister.setPhoneNumber(request.getPhoneNumber());
        lister.setFullName(request.getFullName());
        return lister;

    }

    public static RegisterListerResponse map(Lister lister) {
        RegisterListerResponse response = new RegisterListerResponse();
        response.setDbId(lister.getId());
        response.setDateAndTimeCreated(DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a").format(lister.getDateRegistered()));
        return response;
    }
}
