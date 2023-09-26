package biz.gelicon.core.utilitycopydata.repository;


import biz.gelicon.core.utilitycopydata.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRep extends JpaRepository<Client, Long> {
    boolean existsByClientId(Integer cliendId);
}
