package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainErrorStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainErrorStatusRepository extends JpaRepository<MainErrorStatus, Long> {

    boolean existsByErrorId(Integer errorId);
}
