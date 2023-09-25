package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainError;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainErrorRepository extends JpaRepository<MainError, Long> {

    boolean existsByErrorId(Integer errorId);
}
