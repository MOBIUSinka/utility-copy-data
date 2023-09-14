package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.WorkGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkGroupRepository extends JpaRepository<WorkGroup, Long> {
}
