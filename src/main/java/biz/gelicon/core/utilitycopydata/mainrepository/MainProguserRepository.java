package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainProguser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainProguserRepository extends JpaRepository<MainProguser, Long> {
    boolean existsByProguserId(Integer proguserId);
}
