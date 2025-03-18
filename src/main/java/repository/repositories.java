package repository;

import model.usuario;
import model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public class repositories {

    @Repository
    public interface UsuarioRepository extends JpaRepository<usuario, Long> {
        Optional<usuario> findByEmail(String email);
    }

    @Repository
    public interface SoftwareRepository extends JpaRepository<software, Long> {
    }

    @Repository
    public interface ProfessorRepository extends JpaRepository<professor, Long> {
    }

    @Repository
    public interface LaboratorioRepository extends JpaRepository<laboratorio, Long> {
    }

    @Repository
    public interface SolicitacaoRepository extends JpaRepository<SolicitacaoInstalacao, Long> {
    }
}
