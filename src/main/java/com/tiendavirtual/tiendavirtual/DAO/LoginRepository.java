package com.tiendavirtual.tiendavirtual.DAO;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.tiendavirtual.tiendavirtual.Entity.Users;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface LoginRepository extends CrudRepository<Users, Long>{
    public Optional<Users> findByUsername(String username);
}
