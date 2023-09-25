package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProjectAccountWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainProjectAccountWorkRep extends JpaRepository<MainProjectAccountWork, Long> {
    boolean existsByprojectaccountingworkId(Integer projectaccountingworkId);
}
