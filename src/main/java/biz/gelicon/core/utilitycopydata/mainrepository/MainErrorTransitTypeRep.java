package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainClient;
import biz.gelicon.core.utilitycopydata.mainmodel.MainErrorTransitType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainErrorTransitTypeRep extends JpaRepository<MainErrorTransitType, Long> {
    boolean existsByerrortransittypeId(Integer errortransittypeId);
}
