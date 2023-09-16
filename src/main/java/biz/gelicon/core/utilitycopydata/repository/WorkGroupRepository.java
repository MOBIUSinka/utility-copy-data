package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.WorkGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkGroupRepository extends JpaRepository<WorkGroup, Long> {

    boolean existsByWorkGroupId(Integer WorkGroupId);
}
