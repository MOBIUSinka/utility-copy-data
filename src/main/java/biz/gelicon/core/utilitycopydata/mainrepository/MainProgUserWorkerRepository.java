package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProgUserWorker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainProgUserWorkerRepository extends JpaRepository<MainProgUserWorker, Long> {

    boolean existsByProgUserId(Integer progUserId);
}
