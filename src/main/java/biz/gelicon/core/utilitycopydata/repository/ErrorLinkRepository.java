package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ErrorLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorLinkRepository extends JpaRepository<ErrorLink, Long> {

    boolean existsByErrorLinkId(Integer errorLinkId);
}
