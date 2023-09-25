package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ErrorTransitType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorTransitTypeRep extends JpaRepository<ErrorTransitType, Long> {
    boolean existsByErrorTransitTypeId(Integer ErrorTransitTypeId);
}

