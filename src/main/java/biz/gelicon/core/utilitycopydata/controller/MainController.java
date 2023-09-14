package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainrepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import javax.xml.crypto.Data;
import java.util.List;

@Controller
public class MainController {

    //
    // - main db repositories
    //
    @Autowired
    DepartmentRepository mainDepartmentRepository;

    @Autowired
    ProjectRepository mainProjectRepository;

    @Autowired
    WorkerRepository mainWorkerRepository;

    @Autowired
    WorkGroupRepository mainWorkGroupRepository;

    ///

    @Autowired
    CapCodeRepository maincapCodeRepository;

    @Autowired
    CapCodeTypeRepository maincapCodeTypeRepository;

    @Autowired
    ProguserRepository mainproguserRepository;

    @Autowired
    ProguserGroupRepository mainproguserGroupRepository;

    // *



    //
    // - test db repositories
    //
    @Autowired
    biz.gelicon.core.utilitycopydata.repository.DepartmentRepository departmentRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.ProjectRepository projectRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.WorkerRepository workerRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.WorkGroupRepository workGroupRepository;

    ///

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.CapCodeRepository capCodeRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.CapCodeTypeRepository capCodeTypeRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.ProguserRepository proguserRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.ProguserGroupRepository proguserGroupRepository;

    // *


    public void existenceCheckData(
            JpaRepository<?, ?> mainRepo,
            JpaRepository<?, ?> testRepo
    ) {

    }
}
