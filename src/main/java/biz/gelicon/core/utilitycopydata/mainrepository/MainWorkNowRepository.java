package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainWorkNow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainWorkNowRepository extends JpaRepository<MainWorkNow, Long> {

    boolean existsByWorkNowId(Integer workNowId);
}
