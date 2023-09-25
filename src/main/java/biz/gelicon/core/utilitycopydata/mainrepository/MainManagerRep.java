package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainApplication;
import biz.gelicon.core.utilitycopydata.mainmodel.MainManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainManagerRep extends JpaRepository<MainManager, Long> {
    boolean existsBymanagerId(Integer managerId);
}
