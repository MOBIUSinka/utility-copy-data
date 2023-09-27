package biz.gelicon.core.utilitycopydata.controller;

import biz.gelicon.core.utilitycopydata.mainmodel.*;
import biz.gelicon.core.utilitycopydata.mainrepository.*;
import biz.gelicon.core.utilitycopydata.model.*;
import biz.gelicon.core.utilitycopydata.model.Error;
import biz.gelicon.core.utilitycopydata.repository.*;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
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

    // Юшков
        @Autowired
        MainDepartmentRepository mainDepartmentRepository;

        @Autowired
        MainProjectRepository mainProjectRepository;

        @Autowired
        MainWorkerRepository mainWorkerRepository;

        @Autowired
        MainWorkGroupRepository mainWorkGroupRepository;

        @Autowired
        MainErrorRepository mainErrorRepository;

        @Autowired
        MainErrorLinkRepository mainErrorLinkRepository;

        @Autowired
        MainErrorTransitRepository mainErrorTransitRepository;

        @Autowired
        MainErrorCommentRepository mainErrorCommentRepository;

        @Autowired
        MainErrorStatusRepository mainErrorStatusRepository;

        @Autowired
        MainWorkNowRepository mainWorkNowRepository;

        ///

    // Просвирнин

        @Autowired
        MainCapCodeRepository mainCapCodeRepository;

        @Autowired
        MainCapCodeTypeRepository mainCapCodeTypeRepository;

        @Autowired
        MainProguserRepository mainProguserRepository;

        @Autowired
        MainProguserGroupRepository mainProguserGroupRepository;

        @Autowired
        MainApplicationRep mainApplicationRep;
        @Autowired
        MainErrorTypeRep mainErrorTypeRep;
        @Autowired
        MainClientRep mainClientRep;
        @Autowired
        MainProjectAccountTypeRep mainProjectAccountTypeRep;
        @Autowired
        MainProjectAccountRep mainProjectAccountRep;
        @Autowired
        MainProjectAccountWorkRep mainProjectAccountWorkRep;
        @Autowired
        MainErrorTransitTypeRep mainErrorTransitTypeRep;
        @Autowired
        MainManagerRep mainManagerRep;

        // *



        //
        // - test db repositories
        //

    // Юшков
        @Autowired
        biz.gelicon.core.utilitycopydata.repository.DepartmentRepository departmentRepository;

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.ProjectRepository projectRepository;

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.WorkerRepository workerRepository;

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.WorkGroupRepository workGroupRepository;

        @Autowired
        ErrorRepository errorRepository;

        @Autowired
        ErrorLinkRepository errorLinkRepository;

        @Autowired
        ErrorCommentRepository errorCommentRepository;

        @Autowired
        ErrorStatusRepository errorStatusRepository;

        @Autowired
        ErrorTransitRepository errorTransitRepository;

        @Autowired
        WorkNowRepository workNowRepository;

        ///

    // Просвирнин

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.CapCodeRepository capCodeRepository;

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.CapCodeTypeRepository capCodeTypeRepository;

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.ProguserRepository proguserRepository;

        @Autowired
        biz.gelicon.core.utilitycopydata.repository.ProguserGroupRepository proguserGroupRepository;

        @Autowired
        ErrorTypeRep errorTypeRep;
        @Autowired
        ClientRep clientRep;
        @Autowired
        ProjectAccountTypeRep projectAccountTypeRep;
        @Autowired
        ProjectAccountRep projectAccountRep;
        @Autowired
        ProjectAccountWorkRep projectAccountWorkRep;
        @Autowired
        ApplicationRep applicationRep;
        @Autowired
        ErrorTransitTypeRep errorTransitTypeRep;
        @Autowired
        ManagerRep managerRep;

        // *

    // Просвирнин

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




    // Перенос таблицы ProguserGroup
    public void copyProguserGroupData() {

        List<ProguserGroup> proguserGroupList = proguserGroupRepository.findAll();
        for (ProguserGroup proguserGroup : proguserGroupList) {
            Integer ProguserGroupId = proguserGroup.getProguserGroupId();
            if(!mainProguserGroupRepository.existsByProguserGroupId(ProguserGroupId)){
                MainProguserGroup mainProguserGroup = new MainProguserGroup();
                mainProguserGroup.setProguserGroupId(proguserGroup.getProguserGroupId());
                mainProguserGroup.setProguserGroupName(proguserGroup.getProguserGroupName());
                mainProguserGroup.setProguserGroupVisible(proguserGroup.getProguserGroupVisible());
                mainProguserGroup.setProguserGroupNote(proguserGroup.getProguserGroupNote());
                mainProguserGroupRepository.save(mainProguserGroup);
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

    // Перенос таблицы ErrorTransitType
    public void copyErrorTransitType() {

        List<ErrorTransitType> errorTransitTypeList = errorTransitTypeRep.findAll();
        for (ErrorTransitType errorTransitType : errorTransitTypeList) {
            Integer errortransittypeId = errorTransitType.getErrortransittypeId();
            if(!mainErrorTransitTypeRep.existsByerrortransittypeId(errortransittypeId)){
                MainErrorTransitType mainErrorTransitType = new MainErrorTransitType();
                mainErrorTransitType.setErrortransittypeId(errorTransitType.getErrortransittypeId());
                mainErrorTransitType.setErrortransittypeCode(errorTransitType.getErrortransittypeCode());
                mainErrorTransitType.setErrortransittypeName(errorTransitType.getErrortransittypeName());
                mainErrorTransitType.setErrortransittypeDirection(errorTransitType.getErrortransittypeDirection());
                mainErrorTransitType.setTowhomId(errorTransitType.getTowhomId());
                mainErrorTransitType.setWitherrortransittypeId(errorTransitType.getWitherrortransittypeId());
                mainErrorTransitType.setErrortransittypeSendtoskv(errorTransitType.getErrortransittypeSendtoskv());
                mainErrorTransitType.setErrortransittypeDescript(errorTransitType.getErrortransittypeDescript());
                mainErrorTransitType.setErrortransittypeResult(errorTransitType.getErrortransittypeResult());
                mainErrorTransitType.setErrortransittypeClose(errorTransitType.getErrortransittypeClose());
                mainErrorTransitType.setErrortransittypeNotificexcl(errorTransitType.getErrortransittypeNotificexcl());
                mainErrorTransitType.setErrortransittypeModule(errorTransitType.getErrortransittypeModule());
                mainErrorTransitTypeRep.save(mainErrorTransitType);
            }
        }
    }

    // Перенос таблицы ErrorType
    public void copyErrorType() {

        List<ErrorType> errorTypeList = errorTypeRep.findAll();
        for (ErrorType errorType : errorTypeList) {
            Integer errortypeId = errorType.getErrortypeId();
            if(!mainErrorTypeRep.existsByerrortypeId(errortypeId)){
                MainErrorType mainErrorType = new MainErrorType();
                mainErrorType.setErrortypeId(errorType.getErrortypeId());
                mainErrorType.setErrortypeCode(errorType.getErrortypeCode());
                mainErrorType.setErrortypeName(errorType.getErrortypeName());
                mainErrorTypeRep.save(mainErrorType);
            }
        }
    }

    // Перенос таблицы Client
    public void copyClient() {

        List<Client> clientList = clientRep.findAll();
        for (Client client : clientList) {
            Integer clientId = client.getClientId();
            if(!mainClientRep.existsByClientId(clientId)){
                MainClient mainClient = new MainClient();
                mainClient.setClientId(client.getClientId());
                mainClient.setClientCode(client.getClientCode());
                mainClient.setClientStatus(client.getClientStatus());
                mainClient.setClientReportId(client.getClientReportId());
                mainClient.setClientName(client.getClientName());
                mainClientRep.save(mainClient);
            }
        }
    }

    // Перенос таблицы ProjectAccountType
    public void copyProjectAccountType() {

        List<ProjectAccountType> projectAccountTypeList = projectAccountTypeRep.findAll();
        for (ProjectAccountType projectAccountType : projectAccountTypeList) {
            Integer projectaccounttypeId = projectAccountType.getProjectaccounttypeId();
            if(!mainProjectAccountTypeRep.existsByprojectaccounttypeId(projectaccounttypeId)){
                MainProjectAccountType mainProjectAccountType = new MainProjectAccountType();
                mainProjectAccountType.setProjectaccounttypeId(projectAccountType.getProjectaccounttypeId());
                mainProjectAccountType.setProjectaccounttypeName(projectAccountType.getProjectaccounttypeName());
                mainProjectAccountTypeRep.save(mainProjectAccountType);
            }
        }
    }
    // Перенос таблицы ProjectAccount
    public void copyProjectAccount() {

        List<ProjectAccount> projectAccountList = projectAccountRep.findAll();
        for (ProjectAccount projectAccount : projectAccountList) {
            Integer projectAccountId = projectAccount.getProjectaccountid();
            if(!mainProjectAccountRep.existsByprojectaccountid(projectAccountId)){
                MainProjectAccount mainProjectAccount = new MainProjectAccount();
                mainProjectAccount.setProjectaccountid(projectAccount.getProjectaccountid());
                mainProjectAccount.setProjectaccountCode(projectAccount.getProjectaccountCode());
                mainProjectAccount.setClientid(projectAccount.getClientid());
                mainProjectAccount.setProjectaccounttypeId(projectAccount.getProjectaccounttypeId());
                mainProjectAccount.setProjectaccountName(projectAccount.getProjectaccountName());
                mainProjectAccount.setProjectaccountStatus(projectAccount.getProjectaccountStatus());
                mainProjectAccount.setProjectaccountreportId(projectAccount.getProjectaccountreportId());
                mainProjectAccount.setWorkerId(projectAccount.getWorkerId());
                mainProjectAccountRep.save(mainProjectAccount);
            }
        }
    }
    // Перенос таблицы ProjectAccountWork
    public void copyProjectAccountWork() {

        List<ProjectAccountWork> projectAccountWorkList = projectAccountWorkRep.findAll();
        for (ProjectAccountWork projectAccountWork : projectAccountWorkList) {
            Integer projectAccountWorkId = projectAccountWork.getProjectaccountingworkId();
            if(!mainProjectAccountWorkRep.existsByprojectaccountingworkId(projectAccountWorkId)){
                MainProjectAccountWork mainProjectAccountWork = new MainProjectAccountWork();
                mainProjectAccountWork.setProjectaccountingworkId(projectAccountWork.getProjectaccountingworkId());
                mainProjectAccountWork.setProjectaccountId(projectAccountWork.getProjectaccountId());
                mainProjectAccountWork.setProjectaccountworkName(projectAccountWork.getProjectaccountworkName());
                mainProjectAccountWork.setProjectaccountworkReportId(projectAccountWork.getProjectaccountworkReportId());
                mainProjectAccountWork.setProjectaccountworkStatus(projectAccountWork.getProjectaccountworkStatus());
                mainProjectAccountWorkRep.save(mainProjectAccountWork);
            }
        }
    }

    // Перенос таблицы Manager
    public void copyManager() {

        List<Manager> managerList = managerRep.findAll();
        for (Manager manager : managerList) {
            Integer managerId = manager.getManagerId();
            if(!mainManagerRep.existsBymanagerId(managerId)){
                MainManager mainManager = new MainManager();
                mainManager.setManagerId(manager.getManagerId());
                mainManager.setWorkerId(manager.getWorkerId());
                mainManager.setErrortransittypeId(manager.getErrortransittypeId());
                mainManager.setProjectId(manager.getProjectId());
                mainManager.setApplicationId(manager.getApplicationId());
                mainManager.setProjectaccountId(manager.getProjectaccountId());
                mainManager.setProjectaccountingworkId(manager.getProjectaccountingworkId());
                mainManager.setDepartmentId(manager.getDepartmentId());
                mainManagerRep.save(mainManager);
            }
        }
    }
    // Перенос таблицы Application
    public void copyApplication() {

        List<Application> applicationList = applicationRep.findAll();
        for (Application application : applicationList) {
            Integer applicationId = application.getApplicationId();
            if(!mainApplicationRep.existsByapplicationId(applicationId)){
                MainApplication mainApplication = new MainApplication();
                mainApplication.setApplicationId(application.getApplicationId());
                mainApplication.setApplicationType(application.getApplicationType());
                mainApplication.setApplicationCode(application.getApplicationCode());
                mainApplication.setApplicationName(application.getApplicationName());
                mainApplication.setApplicationExe(application.getApplicationExe());
                mainApplication.setApplicationBlob(application.getApplicationBlob());
                mainApplication.setApplicationDesc(String.valueOf(application.getApplicationStatus()));
                mainApplicationRep.save(mainApplication);
            }
        }
    }


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

            if (surname == null) {
                surname = "-";
            }

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

    // узнать пол по отчеству
    public static Integer getGenderByPatronymic(String patronymic) {
        if (patronymic != null && !patronymic.isEmpty()) {
            String patronymicLower = patronymic.toLowerCase().trim();
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
        } else {
            return 2;
        }
    }

    public void copyWorkerData() {
        List<Worker> workerList = workerRepository.findAll();
        for(Worker worker : workerList) {
            Integer workerId = worker.getWorkerId();
            if (!mainWorkerRepository.existsByWorkerId(workerId)) {
                MainWorker mainWorker = new MainWorker();
                mainWorker.setWorkerId(worker.getWorkerId());

                if (worker.getWorkerSurname() == null) {
                    mainWorker.setWorkerSurname("-");
                } else {
                    mainWorker.setWorkerSurname(worker.getWorkerSurname());
                }

                mainWorker.setWorkerTabNumber(searchWorkerTabNumber(worker.getWorkerFamily(),
                        worker.getWorkerFirstname(),
                        worker.getWorkerSurname(),
                        worker.getWorkerReportId())
                );

                mainWorker.setWorkerFamilyname(worker.getWorkerFamilyName());
                mainWorker.setWorkerFirstname(worker.getWorkerFirstname());



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

    public void copyErrorData() {
        List<Error> errorList = errorRepository.findAll();
        for (Error error : errorList) {
            Integer errorId = error.getErrorId();
            if (!mainErrorRepository.existsByErrorId(errorId)) {
                MainError mainError = new MainError();
                mainError.setErrorId(error.getErrorId());
                mainError.setErrorTypeId(error.getErrorTypeId());
                mainError.setProjectId(error.getProjectId());
                mainError.setClientId(error.getClientId());
                mainError.setWorkerId(error.getWorkerId());

                Date dateErrorDate = new Date(error.getErrorDate().getTime());
                mainError.setErrorDate(dateErrorDate);
                Date dateErrorDateNeed = new Date(error.getErrorDateNeed().getTime());
                mainError.setErrorDateNeed(dateErrorDateNeed);
                mainError.setErrorText(error.getErrorText());

                String strErrorKeeping = new String(error.getErrorKeeping());
                mainError.setErrorKeeping(strErrorKeeping);
                mainError.setErrorOle(error.getErrorOle());
                mainError.setErrorStatus(error.getErrorStatus());
                mainError.setErrorPlan(error.getErrorPlan().floatValue());
                mainError.setErrorFact(error.getErrorFact().floatValue());

                String strErrorCorrectionText = new String(error.getErrorCorrectionText());
                mainError.setErrorCorrectionText(strErrorCorrectionText);

                String strErrorDescription = new String(error.getErrorDescription());
                mainError.setErrorDescription(strErrorDescription);
                mainError.setErrorKindId(error.getErrorKindId());
                mainError.setErrorSeverityId(error.getErrorSeverityId());
                mainError.setErrorPriority(error.getErrorPriority());
                mainError.setProjectAccountId(error.getProjectAccountId());
                mainError.setProjectAccountingWorkId(error.getProjectAccountWorkId());
                mainErrorRepository.save(mainError);
            }
        }
    }

    public void copyErrorCommentData() {
        List<ErrorComment> errorCommentList = errorCommentRepository.findAll();
        for (ErrorComment errorComment : errorCommentList) {
            Integer errorCommentId = errorComment.getErrorCommentId();
            if (!mainErrorCommentRepository.existsByErrorCommentId(errorCommentId)) {
                MainErrorComment mainErrorComment = new MainErrorComment();
                mainErrorComment.setErrorCommentId(errorComment.getErrorCommentId());
                mainErrorComment.setErrorId(errorComment.getErrorId());
                mainErrorComment.setParentErrorCommentId(errorComment.getParentErrorCommentId());
                mainErrorComment.setAuthorId(errorComment.getAuthorId());
                mainErrorComment.setAddresseeId(errorComment.getAddresseeId());

                Date dateErrorCommentDate = new Date(errorComment.getErrorCommentDate().getTime());
                mainErrorComment.setErrorCommentDate(dateErrorCommentDate);

                String strErrorCommentText = new String(errorComment.getErrorCommentText());
                mainErrorComment.setErrorCommentText(strErrorCommentText);
                mainErrorComment.setErrorCommentNeedAnswer(errorComment.getErrorCommentNeedAnswer());
                mainErrorCommentRepository.save(mainErrorComment);
            }
        }
    }

    public void copyErrorStatusData() {
        List<ErrorStatus> errorStatusList = errorStatusRepository.findAll();
        for (ErrorStatus errorStatus : errorStatusList) {
            Integer errorStatusId = errorStatus.getErrorId();
            if (!mainErrorStatusRepository.existsByErrorId(errorStatusId)) {
                MainErrorStatus mainErrorStatus = new MainErrorStatus();
                mainErrorStatus.setErrorId(errorStatus.getErrorId());
                mainErrorStatus.setErrorTransitId(errorStatus.getErrorTransitId());
                mainErrorStatusRepository.save(mainErrorStatus);
            }
        }
    }

    public void copyErrorTransitData() {
        List<ErrorTransit> errorTransitList = errorTransitRepository.findAll();
        for (ErrorTransit errorTransit : errorTransitList) {
            Integer errorTransitId = errorTransit.getErrorTransitId();
            if (!mainErrorTransitRepository.existsByErrorTransitId(errorTransitId)) {
                MainErrorTransit mainErrorTransit = new MainErrorTransit();
                mainErrorTransit.setErrorTransitId(errorTransit.getErrorTransitId());
                mainErrorTransit.setErrorTransitTypeId(errorTransit.getErrorTransitTypeId());
                mainErrorTransit.setErrorId(errorTransit.getErrorId());
                mainErrorTransit.setWorkerId(errorTransit.getWorkerId());

                Date dateErrorTransitDate = new Date(errorTransit.getErrorTransitDate().getTime());
                mainErrorTransit.setErrorTransitDate(dateErrorTransitDate);

                String strErrorTransitText = new String(errorTransit.getErrorTransitText());
                mainErrorTransit.setErrorTransitText(strErrorTransitText);
                mainErrorTransit.setErrorTransitPlan(errorTransit.getErrorTransitPlan().floatValue());
                mainErrorTransit.setErrorTransitFact(errorTransit.getErrorTransitFact().floatValue());

                Date dateErrorTransitDateNeed = new Date(errorTransit.getErrorTransitDateNeed().getTime());
                mainErrorTransit.setErrorTransitDateNeed(dateErrorTransitDateNeed);
                mainErrorTransit.setFromWorkerId(errorTransit.getFromWorkerId());
                mainErrorTransit.setTransitPlanFlag(errorTransit.getTransitPlanFlag());
                mainErrorTransitRepository.save(mainErrorTransit);
            }
        }
    }

    public void copyErrorLinkData() {
        List<ErrorLink> errorLinkList = errorLinkRepository.findAll();
        for (ErrorLink errorLink : errorLinkList) {
            Integer errorLinkId = errorLink.getErrorLinkId();
            if (!mainErrorLinkRepository.existsByErrorLinkId(errorLinkId)) {
                MainErrorLink mainErrorLink = new MainErrorLink();
                mainErrorLink.setErrorLinkId(errorLink.getErrorLinkId());
                mainErrorLink.setErrorMainId(errorLink.getErrorMainId());
                mainErrorLink.setErrorId(errorLink.getErrorId());
                mainErrorLinkRepository.save(mainErrorLink);
            }
        }
    }

    public void copyWorkNowData() {
        List<WorkNow> workNowList = workNowRepository.findAll();
        for (WorkNow workNow : workNowList) {
            Integer workNowId = workNow.getWorkNowId();
            if (!mainWorkNowRepository.existsByWorkNowId(workNowId)) {
                MainWorkNow mainWorkNow = new MainWorkNow();
                mainWorkNow.setWorkNowId(workNow.getWorkNowId());
                mainWorkNow.setWorkerId(workNow.getWorkerId());
                mainWorkNow.setErrorId(workNow.getErrorId());

                Date dateWorkNowDateBeg = new Date(workNow.getWorkNowDateBeg().getTime());
                mainWorkNow.setWorkNowDateBeg(dateWorkNowDateBeg);

                Date dateWorkNowDateEnd = new Date(workNow.getWorkNowDateEnd().getTime());
                mainWorkNow.setWorkNowDateEnd(dateWorkNowDateEnd);
                mainWorkNowRepository.save(mainWorkNow);
            }
        }
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        copyWorkerData();
        return ResponseEntity.ok("Succ");
    }

    @GetMapping("/test-all")
    public ResponseEntity<List<Worker>> allWorkers() {
            return ResponseEntity.ok(workerRepository.findAll());
    }

    // запуск процесса
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


        CompletableFuture<Void> copyProguserGroup = CompletableFuture.runAsync(() -> {
            try {
                copyProguserGroupData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ProguserGroup: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProguser = CompletableFuture.runAsync(() -> {
            try {
                copyProguserData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Proguser: " + e.getMessage());
            }
        });



        CompletableFuture<Void> allOf =
                CompletableFuture.allOf(copyDepartment, copyWorkGroup, copyWorker, copyProject, copyCapCode, copyCapCodeType, copyProguserGroup, copyProguser); // всевозможные
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

    @GetMapping("/start-second-process")
    public ResponseEntity<String> startSecondProcessToCopyData() {
        List<String> failedOperations = new ArrayList<>();

        CompletableFuture<Void> copyErrorLink = CompletableFuture.runAsync(() -> {
            try {
                copyErrorLinkData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ErrorLink: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyErrorStatus = CompletableFuture.runAsync(() -> {
            try {
                copyErrorStatusData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ErrorStatus: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyErrorComment = CompletableFuture.runAsync(() -> {
            try {
                copyErrorCommentData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ErrorComment: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyWorkNow = CompletableFuture.runAsync(() -> {
            try {
                copyWorkNowData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных WorkNow: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyApplcation = CompletableFuture.runAsync(() -> {
            try {
                copyApplication();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Application: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyClient = CompletableFuture.runAsync(() -> {
            try {
                copyClient();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Client: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyErrorTransitType = CompletableFuture.runAsync(() -> {
            try {
                copyErrorTransitType();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ErrorTransitType: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyErrorTransit = CompletableFuture.runAsync(() -> {
            try {
                copyErrorTransitData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ErrorTransit: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyErrorType = CompletableFuture.runAsync(() -> {
            try {
                copyErrorType();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ErrorType: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProjectAccountType = CompletableFuture.runAsync(() -> {
            try {
                copyProjectAccountType();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ProjectAccountType: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProjectAccount = CompletableFuture.runAsync(() -> {
            try {
                copyProjectAccount();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ProjectAccount: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyProjectAccountWork = CompletableFuture.runAsync(() -> {
            try {
                copyProjectAccountWork();
            } catch (Exception e) {
                failedOperations.add("Перенос данных ProjectAccountWork: " + e.getMessage());
            }
        });

        CompletableFuture<Void> copyError = CompletableFuture.runAsync(() -> {
            try {
                copyErrorData();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Error: " + e.getMessage());
            }
        });



        CompletableFuture<Void> copyManager = CompletableFuture.runAsync(() -> {
            try {
                copyManager();
            } catch (Exception e) {
                failedOperations.add("Перенос данных Manager: " + e.getMessage());
            }
        });

        CompletableFuture<Void> allOfSecond =
                CompletableFuture.allOf(copyErrorLink, copyErrorStatus, copyErrorComment, copyWorkNow,
                        copyApplcation, copyErrorType, copyClient, copyErrorTransitType,
                        copyManager, copyProjectAccount, copyProjectAccountType,
                        copyProjectAccountWork, copyError, copyErrorTransit);

        try {
            allOfSecond.get();
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

    @GetMapping("/start-single-process")
    public ResponseEntity<String> startSingleProcessToCopyData() {
            try {
                copyProjectAccountWork();
                return ResponseEntity.ok("Все данные были успешно перенесены. ");

            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Произошла ошибка при выполнении операций: " + e.getMessage());
            }
    }
}
