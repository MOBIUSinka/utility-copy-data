package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainrepository.DepartmentRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.ProjectRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.WorkGroupRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    // - main db repositories
    @Autowired
    DepartmentRepository mainDepartmentRepository;

    @Autowired
    ProjectRepository mainProjectRepository;

    @Autowired
    WorkerRepository mainWorkerRepository;

    @Autowired
    WorkGroupRepository mainWorkGroupRepository;



    // - test db repositories
    @Autowired
    biz.gelicon.core.utilitycopydata.repository.DepartmentRepository departmentRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.ProjectRepository projectRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.WorkerRepository workerRepository;

    @Autowired
    biz.gelicon.core.utilitycopydata.repository.WorkGroupRepository workGroupRepository;
}
