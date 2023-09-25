package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainApplication;
import biz.gelicon.core.utilitycopydata.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRep extends JpaRepository<Application, Long> {
    boolean existsByapplicationId(Integer applicationId);
}

