package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainErrorType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainErrorTypeRep extends JpaRepository<MainErrorType, Long> {
    boolean existsByerrortypeId(Integer errortypeId);

}
