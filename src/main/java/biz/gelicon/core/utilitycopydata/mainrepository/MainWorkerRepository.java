package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainWorker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainWorkerRepository extends JpaRepository<MainWorker, Long> {

    boolean existsByWorkerId(Integer workerId);
}
