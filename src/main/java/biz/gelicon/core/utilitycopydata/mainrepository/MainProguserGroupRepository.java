package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProguserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainProguserGroupRepository extends JpaRepository<MainProguserGroup, Long> {
    boolean existsById(Integer id);
}
