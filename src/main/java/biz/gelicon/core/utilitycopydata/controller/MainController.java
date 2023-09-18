package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainmodel.*;
import biz.gelicon.core.utilitycopydata.mainrepository.*;
import biz.gelicon.core.utilitycopydata.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


@Controller
@RequestMapping("/api")
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

        ///

        @Autowired
        MainCapCodeRepository mainCapCodeRepository;

        @Autowired
        MainCapCodeTypeRepository mainCapCodeTypeRepository;

        @Autowired
        MainProguserRepository mainProguserRepository;

        @Autowired
        MainProguserGroupRepository mainProguserGroupRepository;

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

    // Перенос таблицы CapCode
        public void copyCapCodeData() {

            List<CapCode> capCodeList = capCodeRepository.findAll();
            for (CapCode capCode : capCodeList) {
                Integer CapCodeId = capCode.getCapCodeId();
                if(!mainCapCodeRepository.existsByCapCodeId(CapCodeId)){
                    MainCapCode mainCapCode = new MainCapCode();
                    mainCapCode.setCapCodeId(capCode.getCapCodeId());
                    mainCapCode.setCapCodeName(capCode.getCapCodeName());
                    mainCapCode.setCapCodeCode(capCode.getCapCodeCode());
                    mainCapCode.setCapCodeText(capCode.getCapCodeText());
                    mainCapCode.setCapCodeTypeId(capCode.getCapCodeTypeId());
                    mainCapCode.setCapCodeSortCode(capCode.getCapCodeSortCode());
                    mainCapCodeRepository.save(mainCapCode);
                }
            }
        }

    // Перенос таблицы CapCodeType
        public void copyCapCodeTypeData() {

            List<CapCodeType> capCodeTypeList = capCodeTypeRepository.findAll();
            for (CapCodeType capCodeType : capCodeTypeList) {
                Integer CapCodeTypeId = capCodeType.getCapCodeTypeId();
                if(!mainCapCodeTypeRepository.existsByCapCodeTypeId(CapCodeTypeId)){
                    MainCapCodeType mainCapCodeType = new MainCapCodeType();
                    mainCapCodeType.setCapCodeTypeId(capCodeType.getCapCodeTypeId());
                    mainCapCodeType.setCapCodeTypeName(capCodeType.getCapCodeTypeName());
                    mainCapCodeType.setCapCodeTypeCode(capCodeType.getCapCodeTypeCode());
                    mainCapCodeType.setCapCodeTypeText(capCodeType.getCapCodeTypeText());
                    mainCapCodeTypeRepository.save(mainCapCodeType);
                }
            }
        }
    // Перенос таблицы Proguser


    public void copyProguserData() {

        List<Proguser> proguserList = proguserRepository.findAll();
        for (Proguser proguser : proguserList) {
            Integer ProguserId = proguser.getProguserId();
            if(!mainProguserRepository.existsByProguserId(ProguserId)){
                MainProguser mainProguser = new MainProguser();
                mainProguser.setProguserId(proguser.getProguserId());
                mainProguser.setProguserName(proguser.getProguserName());
                mainProguser.setProguserFullname(proguser.getProguserFullname());
                mainProguser.setProguserGroupId(proguser.getProguserGroupId());
                mainProguser.setProguserType(proguser.getProguserType());
                mainProguser.setProguserStatusId(proguser.getProguserStatusId());
                mainProguser.setProguserWebPassWord(proguser.getProguserWebPassWord());
                mainProguser.setProguserTimeZoneCode(null);
                mainProguserRepository.save(mainProguser);
            }
        }
    }
    // Перенос таблицы ProguserGroup
    public void copyProguserGroupData() {

        List<ProguserGroup> proguserGroupList = proguserGroupRepository.findAll();
        for (ProguserGroup proguserGroup : proguserGroupList) {
            Integer ProguserGroupId = proguserGroup.getProguserGroupId();
            if(!mainProguserGroupRepository.existsByProguserGroupId(ProguserGroupId)){
                MainProguserGroup mainProguserGroup = new MainProguserGroup();
                mainProguserGroup.setProguserGroupName(proguserGroup.getProguserGroupName());
                mainProguserGroup.setProguserGroupVisible(proguserGroup.getProguserGroupVisible());
                mainProguserGroup.setProguserGroupNote(proguserGroup.getProguserGroupNote());
                mainProguserGroupRepository.save(mainProguserGroup);
            }
        }
    }

//    @PostMapping ("/start-process-egor")
//    public ResponseEntity<String> ErrorFinder() {
//        List<String> failedOperations = new ArrayList<>(); // список возможных ошибок
//
//        CompletableFuture<Void> copyCapCode = CompletableFuture.runAsync(() -> {
//            try {
//                copyCapCodeData();
//            } catch (Exception e) {
//                failedOperations.add("Перенос данных CapCode: " + e.getMessage()); // если ошибка, то заносится в список
//            }
//        });
//
//        CompletableFuture<Void> copyCapCodeType = CompletableFuture.runAsync(() -> {
//            try {
//                copyCapCodeTypeData();
//            } catch (Exception e) {
//                failedOperations.add("Перенос данных CapCodeType: " + e.getMessage());
//            }
//        });
//
//        CompletableFuture<Void> copyProguser = CompletableFuture.runAsync(() -> {
//            try {
//                copyProguserData();
//            } catch (Exception e) {
//                failedOperations.add("Перенос данных Proguser: " + e.getMessage());
//            }
//        });
//
//        CompletableFuture<Void> copyProguserGroup = CompletableFuture.runAsync(() -> {
//            try {
//                copyProguserGroupData();
//            } catch (Exception e) {
//                failedOperations.add("Перенос данных ProguserGroup: " + e.getMessage());
//            }
//        });
//
//        CompletableFuture<Void> allOf2 =
//                CompletableFuture.allOf(copyCapCode, copyCapCodeType, copyProguser, copyProguserGroup); // всевозможные
//
//        try {
//            allOf2.get();
//            if (!failedOperations.isEmpty()) {
//                return ResponseEntity.badRequest()
//                        .body("Не удалось выполнить: \n" + String.join("\n", failedOperations));
//            } else {
//                return ResponseEntity.ok("Все данные были успешно перенесены. ");
//            }
//        } catch (InterruptedException | ExecutionException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("Произошла ошибка при выполнении операций: " + e.getMessage());
//        }
//    }

    // Юшков
    public void copyDepartmentData() {
        List<Department> departmentList = departmentRepository.findAll();
        for(Department department : departmentList) {
            Integer departmentId = department.getDepartmentId();
            if (!mainDepartmentRepository.existsByDepartmentId(departmentId)) {
                MainDepartment mainDepartment = new MainDepartment();
                mainDepartment.setDepartmentId(department.getDepartmentId());
                mainDepartment.setDepartmentCode(department.getDepartmentCode());
                mainDepartment.setDepartmentName(department.getDepartmentName());
                mainDepartment.setDepartmentReportId(department.getDepartmentReportId());
                mainDepartmentRepository.save(mainDepartment);
            }
        }
    }


    public void copyWorkGroupData() {
        List<WorkGroup> workGroupList = workGroupRepository.findAll();
        for(WorkGroup workGroup : workGroupList) {
            Integer workGroupId = workGroup.getWorkGroupId();
            if(!mainWorkGroupRepository.existsByWorkGroupId(workGroupId)) {
                MainWorkGroup mainWorkGroup = new MainWorkGroup();
                mainWorkGroup.setWorkGroupId(workGroup.getWorkGroupId());
                mainWorkGroup.setDepartmentId(workGroup.getDepartmentId());
                mainWorkGroup.setDepartmentOwnerId(workGroup.getDepartmentOwnerId());
                mainWorkGroupRepository.save(mainWorkGroup);
            }
        }
    }

    // поиск и возвращение табельного номера сотрудника ( ФИО + reportId )

    public String searchWorkerTabNumber(
            String family,
            String firstname,
            String surname,
            Integer reportId
    ) {
            StringBuilder fioBuilder = new StringBuilder();
        if (reportId == null) {

            fioBuilder.append(family.charAt(0));
            fioBuilder.append(firstname.charAt(0));
            fioBuilder.append(surname.charAt(0));
        } else {
            if (surname == null) {
                fioBuilder.append(family.charAt(0));
                fioBuilder.append(firstname.charAt(0));
                fioBuilder.append(reportId);
            } else {
                fioBuilder.append(family.charAt(0));
                fioBuilder.append(firstname.charAt(0));
                fioBuilder.append(surname.charAt(0));
                fioBuilder.append(reportId);
            }
        }
        return fioBuilder.toString();
    }

//    public String searchWorkerTabNumber(
//            String family,
//            String firstname,
//            String surname,
//            Integer reportId
//    ) {
//            String fio = (family.charAt(0) + firstname.charAt(0) + surname.charAt(0) + String.valueOf(reportId));
//            return fio;
//    }

    // узнать пол по отчеству
    public static Integer getGenderByPatronymic(String patronymic) {
        String patronymicLower = patronymic.toLowerCase();
        if (patronymicLower.endsWith("ович") ||
                patronymicLower.endsWith("евич") ||
                patronymicLower.endsWith("ич")) {
            return 0; // мужской пол
        } else if (patronymicLower.endsWith("овна") ||
                patronymicLower.endsWith("евна") ||
                patronymicLower.endsWith("ична") ||
                patronymicLower.endsWith("инична")) {
            return 1; // женский пол
        } else {
            return 2; // неизвестно
        }
    }

    public void copyWorkerData() {
        List<Worker> workerList = workerRepository.findAll();
        for(Worker worker : workerList) {
            Integer workerId = worker.getWorkerId();
            if (!mainWorkerRepository.existsByWorkerId(workerId)) {
                MainWorker mainWorker = new MainWorker();
                mainWorker.setWorkerId(worker.getWorkerId());

                mainWorker.setWorkerTabNumber(searchWorkerTabNumber(worker.getWorkerFamily(),
                        worker.getWorkerFirstname(),
                        worker.getWorkerSurname(),
                        worker.getWorkerReportId())
                );

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
                mainWorkerRepository.save(mainWorker);
            }
        }
    }

    public void copyProjectData() {
        List<Project> projectList = projectRepository.findAll();
        for(Project project : projectList) {
            Integer projectId = project.getProjectId();
            if (!mainProjectRepository.existsByProjectId(projectId)) {
                MainProject mainProject = new MainProject();
                mainProject.setProjectId(project.getProjectId());
                mainProject.setProjectCode(project.getProjectCode());
                mainProject.setProjectName(project.getProjectName());
                mainProject.setProjectStatus(project.getProjectStatus());
                mainProject.setWorkerId(project.getProjectId());
                mainProject.setDepartmentId(project.getDepartmentId());
                mainProjectRepository.save(mainProject);
            }
        }
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        copyWorkerData();
        return ResponseEntity.ok("Succ");
    }

    @GetMapping("/start-process")
    public ResponseEntity<String> startProcessToCopyData() {
        List<String> failedOperations = new ArrayList<>(); // список возможных ошибок

        CompletableFuture<Void> copyDepartment = CompletableFuture.runAsync(() -> {
            try {
                copyDepartmentData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Department: " + e.getMessage()); // если ошибка, то заносится в список
            }
        });

        CompletableFuture<Void> copyWorkGroup = CompletableFuture.runAsync(() -> {
            try {
                copyWorkGroupData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных WorkGroup: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyWorker = CompletableFuture.runAsync(() -> {
            try {
                copyWorkerData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Worker: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProject = CompletableFuture.runAsync(() -> {
            try {
                copyProjectData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Project: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyCapCode = CompletableFuture.runAsync(() -> {
            try {
                copyCapCodeData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных CapCode: " + e.getMessage()); // если ошибка, то заносится в список
            }
        });

        CompletableFuture<Void> copyCapCodeType = CompletableFuture.runAsync(() -> {
            try {
                copyCapCodeTypeData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных CapCodeType: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProguser = CompletableFuture.runAsync(() -> {
            try {
                copyProguserData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Proguser: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProguserGroup = CompletableFuture.runAsync(() -> {
            try {
                copyProguserGroupData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ProguserGroup: " + e.getMessage());
            }
        });

        CompletableFuture<Void> allOf =
                CompletableFuture.allOf(copyDepartment, copyWorkGroup, copyWorker, copyProject, copyCapCode, copyCapCodeType, copyProguser, copyProguserGroup); // всевозможные
        //

        try {
            allOf.get();
            if (!failedOperations.isEmpty()) {
                return ResponseEntity.badRequest()
                        .body("Не удалось выполнить: \n" + String.join("\n", failedOperations));
            } else {
                return ResponseEntity.ok("Все данные были успешно перенесены. ");
            }
        } catch (InterruptedException | ExecutionException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Произошла ошибка при выполнении операций: " + e.getMessage());
        }
    }
}
