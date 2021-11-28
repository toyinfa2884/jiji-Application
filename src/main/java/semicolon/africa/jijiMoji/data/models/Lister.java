package semicolon.africa.jijiMoji.data.models;

import lombok.Data;

import java.time.LocalDateTime;

@Document("Lister")
@Data
public class Lister {
    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateRegistered = LocalDateTime.now();
    private String location;
}
