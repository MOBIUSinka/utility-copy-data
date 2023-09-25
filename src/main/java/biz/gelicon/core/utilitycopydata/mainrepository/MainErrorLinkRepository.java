package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainErrorLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainErrorLinkRepository extends JpaRepository<MainErrorLink, Long> {

    boolean existsByErrorLinkId(Integer errorLinkId);
}
