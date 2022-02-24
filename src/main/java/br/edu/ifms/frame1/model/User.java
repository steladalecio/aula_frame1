package br.edu.ifms.frame1.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //sempre ter esse @
@AllArgsConstructor //sempre ter esse @
@NoArgsConstructor //sempre ter esse @

public class User {
    UUID id;
    String nome;
    String email;
}
