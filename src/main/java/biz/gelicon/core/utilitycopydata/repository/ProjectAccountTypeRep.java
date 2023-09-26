package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProjectAccountType;
import biz.gelicon.core.utilitycopydata.model.ProjectAccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAccountTypeRep extends JpaRepository<ProjectAccountType, Long> {
    boolean existsByprojectaccounttypeId(Integer projectaccounttypeId);
}
