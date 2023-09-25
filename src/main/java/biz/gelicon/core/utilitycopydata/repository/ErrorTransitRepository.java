package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ErrorTransit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorTransitRepository extends JpaRepository<ErrorTransit, Long> {

    boolean existsByErrorTransitId(Integer errorTransitId);
}
