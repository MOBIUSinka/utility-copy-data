package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProjectAccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainProjectAccountTypeRep extends JpaRepository<MainProjectAccountType, Long> {
    boolean existsByprojectaccounttypeId(Integer projectaccounttypeId);
}
