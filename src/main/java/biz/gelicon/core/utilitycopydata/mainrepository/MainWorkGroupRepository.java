package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainWorkGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainWorkGroupRepository extends JpaRepository<MainWorkGroup, Long> {

    boolean existsByWorkGroupId(Integer WorkGroupId);
}
