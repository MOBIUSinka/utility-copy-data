package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainmodel.MainCapCode;
import biz.gelicon.core.utilitycopydata.mainmodel.MainDepartment;
import biz.gelicon.core.utilitycopydata.mainrepository.*;
import biz.gelicon.core.utilitycopydata.model.CapCode;
import biz.gelicon.core.utilitycopydata.model.Department;
import biz.gelicon.core.utilitycopydata.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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

    // Просвирнин
        public void compareAndTransferRecords() {

            List<CapCode> capCodeList = capCodeRepository.findAll();
            for (CapCode capCode : capCodeList) {
                Integer CapCodeId = capCode.getCapCodeId();
                if(!maincapCodeRepository.existsById(CapCodeId)){
                    MainCapCode mainCapCode = new MainCapCode();
                    mainCapCode.setCapCodeId(capCode.getCapCodeId());
                    mainCapCode.setCapCodeName(capCode.getCapCodeName());
                    mainCapCode.setCapCodeCode(capCode.getCapCodeCode());
                    mainCapCode.setCapCodeText(capCode.getCapCodeText());
                    mainCapCode.setCapCodeTypeId(capCode.getCapCodeTypeId());
                    mainCapCode.setCapCodeSortCode(capCode.getCapCodeSortCode());
                }
            }
        }

    // Юшков
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
