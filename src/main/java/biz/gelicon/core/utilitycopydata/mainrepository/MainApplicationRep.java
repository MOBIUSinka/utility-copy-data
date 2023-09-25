package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainApplication;
import biz.gelicon.core.utilitycopydata.mainmodel.MainCapCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainApplicationRep extends JpaRepository<MainApplication, Long> {
    boolean existsByapplicationId(Integer applicationId);
}

