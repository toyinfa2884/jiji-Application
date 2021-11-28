package semicolon.africa.jijiMoji.data.models;


import lombok.Data;

import java.time.LocalDateTime;

@Document("Listings")
@Data
public class Listing {

        @Id
        private String id;

        private String name;
        private String shortDescription;
        private String longDescription;
        private LocalDateTime dateListed = LocalDateTime.now();
        private Condition condition;
        @DBRef
        private Lister lister;
        private String type;
        private String subType;
        private int numberOfViews;
}
