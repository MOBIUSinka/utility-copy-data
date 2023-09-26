package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProjectAccount;
import biz.gelicon.core.utilitycopydata.model.ProjectAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainProjectAccountRep extends JpaRepository<MainProjectAccount, Long> {
    boolean existsByprojectaccountid(Integer projectaccountid);
}
