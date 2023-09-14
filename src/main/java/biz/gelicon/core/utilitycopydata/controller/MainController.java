package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainmodel.MainDepartment;
import biz.gelicon.core.utilitycopydata.mainrepository.MainDepartmentRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.ProjectRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.WorkGroupRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.WorkerRepository;
import biz.gelicon.core.utilitycopydata.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MainController {

    //
    // - main db repositories
    //
    @Autowired
    MainDepartmentRepository mainDepartmentRepository;

    @Autowired
    ProjectRepository mainProjectRepository;

    @Autowired
    WorkerRepository mainWorkerRepository;

    @Autowired
    WorkGroupRepository mainWorkGroupRepository;

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

    // *


    public void copyData() {
        List<Department> departmentList = departmentRepository.findAll();
        for(Department department : departmentList) {
            Integer departmentId = department.getDepartmentId();
            if (!mainDepartmentRepository.existsById(departmentId)) {
                MainDepartment mainDepartment = new MainDepartment();
                mainDepartment.setDepartmentId(department.getDepartmentId());
                mainDepartment.setDepartmentCode(department.getDepartmentCode());
                mainDepartment.setDepartmentName(department.getDepartmentName());
                mainDepartment.setDepartmentReportId(department.getDepartmentReportId());
            }
        }
    }
}
