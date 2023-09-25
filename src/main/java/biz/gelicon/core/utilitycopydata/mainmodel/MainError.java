package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.sql.Date;

@Entity
@Table(name = "error")
public class MainError {

    @Id
    @Column(name = "error_id", nullable = false)
    private Integer errorId;

    @Column(name = "errortype_id", nullable = false)
    private Integer errorTypeId;

    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "client_id", nullable = false)
    private Integer clientId;

    @Column(name = "worker_id", nullable = false)
    private Integer workerId;

    @Column(name = "error_date", nullable = false)
    private Date errorDate;

    @Column(name = "error_dateneed", nullable = false)
    private Date errorDateNeed;

    @Column(name = "error_text", nullable = false)
    @Size(max = 255)
    private String errorText;

    @Column(name = "error_keeping", nullable = true)
    private String errorKeeping;

    @Column(name = "error_ole", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] errorOle;

    @Column(name = "error_status", nullable = false)
    private Integer errorStatus;

    @Column(name = "error_plan", nullable = true)
    private Float errorPlan;

    @Column(name = "error_fact", nullable = true)
    private Float errorFact;

    @Column(name = "error_correctiontext", nullable = true)
    private String errorCorrectionText;

    @Column(name = "error_description", nullable = true)
    private String errorDescription;

    @Column(name = "errorkind_id", nullable = false)
    private Integer errorKindId;

    @Column(name = "errorseverity_id", nullable = true)
    private Integer errorSeverityId;

    @Column(name = "error_priority", nullable = false)
    private Integer errorPriority;

    @Column(name = "projectaccount_id", nullable = true)
    private Integer projectAccountId;

    @Column(name = "projectaccountingwork_id", nullable = true)
    private Integer projectAccountingWorkId;

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Integer getErrorTypeId() {
        return errorTypeId;
    }

    public void setErrorTypeId(Integer errorTypeId) {
        this.errorTypeId = errorTypeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Date getErrorDate() {
        return errorDate;
    }

    public void setErrorDate(Date errorDate) {
        this.errorDate = errorDate;
    }

    public Date getErrorDateNeed() {
        return errorDateNeed;
    }

    public void setErrorDateNeed(Date errorDateNeed) {
        this.errorDateNeed = errorDateNeed;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getErrorKeeping() {
        return errorKeeping;
    }

    public void setErrorKeeping(String errorKeeping) {
        this.errorKeeping = errorKeeping;
    }

    public byte[] getErrorOle() {
        return errorOle;
    }

    public void setErrorOle(byte[] errorOle) {
        this.errorOle = errorOle;
    }

    public Integer getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(Integer errorStatus) {
        this.errorStatus = errorStatus;
    }

    public Float getErrorPlan() {
        return errorPlan;
    }

    public void setErrorPlan(Float errorPlan) {
        this.errorPlan = errorPlan;
    }

    public Float getErrorFact() {
        return errorFact;
    }

    public void setErrorFact(Float errorFact) {
        this.errorFact = errorFact;
    }

    public String getErrorCorrectionText() {
        return errorCorrectionText;
    }

    public void setErrorCorrectionText(String errorCorrectionText) {
        this.errorCorrectionText = errorCorrectionText;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Integer getErrorKindId() {
        return errorKindId;
    }

    public void setErrorKindId(Integer errorKindId) {
        this.errorKindId = errorKindId;
    }

    public Integer getErrorSeverityId() {
        return errorSeverityId;
    }

    public void setErrorSeverityId(Integer errorSeverityId) {
        this.errorSeverityId = errorSeverityId;
    }

    public Integer getErrorPriority() {
        return errorPriority;
    }

    public void setErrorPriority(Integer errorPriority) {
        this.errorPriority = errorPriority;
    }

    public Integer getProjectAccountId() {
        return projectAccountId;
    }

    public void setProjectAccountId(Integer projectAccountId) {
        this.projectAccountId = projectAccountId;
    }

    public Integer getProjectAccountingWorkId() {
        return projectAccountingWorkId;
    }

    public void setProjectAccountingWorkId(Integer projectAccountingWorkId) {
        this.projectAccountingWorkId = projectAccountingWorkId;
    }

    public MainError() {

    }

    public MainError(Integer errorId,
                     Integer errorTypeId,
                     Integer projectId,
                     Integer clientId,
                     Integer workerId,
                     Date errorDate,
                     Date errorDateNeed,
                     String errorText,
                     String errorKeeping,
                     byte[] errorOle,
                     Integer errorStatus,
                     Float errorPlan,
                     Float errorFact,
                     String errorCorrectionText,
                     String errorDescription,
                     Integer errorKindId,
                     Integer errorSeverityId,
                     Integer errorPriority,
                     Integer projectAccountId,
                     Integer projectAccountingWorkId) {
        this.errorId = errorId;
        this.errorTypeId = errorTypeId;
        this.projectId = projectId;
        this.clientId = clientId;
        this.workerId = workerId;
        this.errorDate = errorDate;
        this.errorDateNeed = errorDateNeed;
        this.errorText = errorText;
        this.errorKeeping = errorKeeping;
        this.errorOle = errorOle;
        this.errorStatus = errorStatus;
        this.errorPlan = errorPlan;
        this.errorFact = errorFact;
        this.errorCorrectionText = errorCorrectionText;
        this.errorDescription = errorDescription;
        this.errorKindId = errorKindId;
        this.errorSeverityId = errorSeverityId;
        this.errorPriority = errorPriority;
        this.projectAccountId = projectAccountId;
        this.projectAccountingWorkId = projectAccountingWorkId;
    }
}
