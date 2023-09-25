package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.WorkNow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkNowRepository extends JpaRepository<WorkNow, Long> {

    boolean existsByWorkNowId(Integer workNowId);
}
