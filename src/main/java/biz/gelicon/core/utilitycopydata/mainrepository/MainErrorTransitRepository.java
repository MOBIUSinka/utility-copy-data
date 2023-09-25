package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainErrorTransit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainErrorTransitRepository extends JpaRepository<MainErrorTransit, Long> {

    boolean existsByErrorTransitId(Integer errorTransitId);
}
