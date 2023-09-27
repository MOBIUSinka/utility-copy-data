package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ProjectAccountWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAccountWorkRep extends JpaRepository<ProjectAccountWork, Long> {
    boolean existsByprojectaccountworkId(Integer projectaccountworkId);
}
