package com.ejemplo.SCruzProgramacionNCapasMaven.Repository;

import com.ejemplo.SCruzProgramacionNCapasMaven.JPA.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByUsername(String username);
}
