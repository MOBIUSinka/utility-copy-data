package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainClientRep extends JpaRepository<MainClient, Long> {
    boolean existsByClientId(Integer ClientId);
}
