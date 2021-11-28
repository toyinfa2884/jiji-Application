package semicolon.africa.jijiMoji.dtos.requests;

import lombok.Data;

@Data
public class RegisterListerRequest {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String location;
}
