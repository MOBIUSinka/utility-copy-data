package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainmodel.MainDepartment;
import biz.gelicon.core.utilitycopydata.mainmodel.MainProject;
import biz.gelicon.core.utilitycopydata.mainmodel.MainWorkGroup;
import biz.gelicon.core.utilitycopydata.mainmodel.MainWorker;
import biz.gelicon.core.utilitycopydata.mainrepository.MainDepartmentRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.MainProjectRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.MainWorkGroupRepository;
import biz.gelicon.core.utilitycopydata.mainrepository.MainWorkerRepository;
import biz.gelicon.core.utilitycopydata.model.Department;
import biz.gelicon.core.utilitycopydata.model.Project;
import biz.gelicon.core.utilitycopydata.model.WorkGroup;
import biz.gelicon.core.utilitycopydata.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
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
    MainProjectRepository mainProjectRepository;

    @Autowired
    MainWorkerRepository mainWorkerRepository;

    @Autowired
    MainWorkGroupRepository mainWorkGroupRepository;

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

    public static Integer getGenderByPatronymic(String patronymic) {
        String patronymicLower = patronymic.toLowerCase();
        if (patronymicLower.endsWith("ович") ||
            patronymicLower.endsWith("евич") ||
            patronymicLower.endsWith("ич")) {
            return 2; // мужской пол
        } else if (patronymicLower.endsWith("овна") ||
                   patronymicLower.endsWith("евна") ||
                   patronymicLower.endsWith("ична") ||
                   patronymicLower.endsWith("инична")) {
            return 1; // женский пол
        } else {
            return 0; // неизвестно
        }
    }

    public void copyDepartmentData() {
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

    public void copyWorkGroupData() {
        List<WorkGroup> workGroupList = workGroupRepository.findAll();
        for(WorkGroup workGroup : workGroupList) {
            Integer workGroupId = workGroup.getWorkGroupId();
            if(!mainWorkGroupRepository.existsById(workGroupId)) {
                MainWorkGroup mainWorkGroup = new MainWorkGroup();
                mainWorkGroup.setWorkGroupId(workGroup.getWorkGroupId());
                mainWorkGroup.setDepartmentId(workGroup.getDepartmentId());
                mainWorkGroup.setDepartmentOwnerId(workGroup.getDepartmentOwnerId());
            }
        }
    }

    public void copyWorkerData() {
        List<Worker> workerList = workerRepository.findAll();
        for(Worker worker : workerList) {
            Integer workerId = worker.getWorkerId();
            if (!mainWorkerRepository.existsById(workerId)) {
                MainWorker mainWorker = new MainWorker();
                mainWorker.setWorkerId(worker.getWorkerId());

                String fio = (worker.getWorkerFamily().charAt(0) +
                        worker.getWorkerFirstname().charAt(0) +
                        worker.getWorkerSurname().charAt(0) +
                        String.valueOf(worker.getWorkerReportId()));
                mainWorker.setWorkerTabNumber(fio);
                mainWorker.setWorkerFamilyname(worker.getWorkerFamilyName());
                mainWorker.setWorkerFirstname(worker.getWorkerFirstname());
                mainWorker.setWorkerSurname(worker.getWorkerSurname());
                mainWorker.setWorkerSex(getGenderByPatronymic(worker.getWorkerSurname()));
                mainWorker.setWorkerBirthday(null);
                mainWorker.setWorkerEmail(worker.getWorkerEmail());
                mainWorker.setWorkerHomephone(null);
                mainWorker.setWorkerWorkphone(null);
                mainWorker.setWorkerContactphone(worker.getWorkerPhone());
                mainWorker.setWorkerRemark(null);
                mainWorker.setDepartmentId(worker.getDepartmentId());
            }
        }
    }

    public void copyProjectData() {
        List<Project> projectList = projectRepository.findAll();
        for(Project project : projectList) {
            Integer projectId = project.getProjectId();
            if (!mainProjectRepository.existsById(projectId)) {
                MainProject mainProject = new MainProject();
                mainProject.setProjectId(project.getProjectId());
                mainProject.setProjectCode(project.getProjectCode());
                mainProject.setProjectName(project.getProjectName());
                mainProject.setProjectStatus(project.getProjectStatus());
                mainProject.setWorkerId(project.getProjectId());
                mainProject.setDepartmentId(project.getDepartmentId());
            }
        }
    }
}
