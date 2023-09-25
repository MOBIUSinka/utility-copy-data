package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainManager;
import biz.gelicon.core.utilitycopydata.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRep extends JpaRepository<Manager, Long> {
    boolean existsBymanagerId(Integer managerId);
}
