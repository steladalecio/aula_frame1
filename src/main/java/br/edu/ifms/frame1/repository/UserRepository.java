package br.edu.ifms.frame1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.edu.ifms.frame1.model.User;

@Repository
public class UserRepository {
    
    private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    //Selecto * from tb_user
    public List<User> findAll(){
        var users = new ArrayList<User>();
        users.add(new User(UUID.randomUUID(), "Gabriel", "gabriel@email.com"));
        users.add(new User(UUID.randomUUID(), "Caio", "caio@email.com"));
        users.add(new User(UUID.randomUUID(), "Eduardo Pavanelli", "eduardo.pavanelli@email.com"));
        users.add(new User(UUID.randomUUID(), "Stella", "stella@email.com"));
        logger.info("Listando os Arquivos.....");
        return users;
    }
}
