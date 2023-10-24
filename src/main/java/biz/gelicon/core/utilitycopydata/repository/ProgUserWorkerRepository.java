package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ProgUserWorker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgUserWorkerRepository extends JpaRepository<ProgUserWorker, Long> {

    boolean existsByProgUserId(Integer progUserId);
}
