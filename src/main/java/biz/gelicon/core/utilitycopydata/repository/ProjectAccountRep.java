package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ProjectAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAccountRep extends JpaRepository<ProjectAccount, Long> {
    boolean existsByprojectaccountid(Integer projectaccountid);
}
