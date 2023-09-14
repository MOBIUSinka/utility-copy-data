package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.ProguserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProguserGroupRepository extends JpaRepository<ProguserGroup, Long> {
    @Override
    boolean existsById(Long id);
}
