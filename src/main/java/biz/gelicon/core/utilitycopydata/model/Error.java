package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name = "error")
public class Error {

    @Id
    @Column(name = "error_id", nullable = false)
    @Size(max = 10)
    private Integer errorId;

    @Column(name = "errortype_id", nullable = false)
    @Size(max = 10)
    private Integer errorTypeId;

    @Column(name = "project_id", nullable = false)
    @Size(max = 10)
    private Integer projectId;

    @Column(name = "client_id", nullable = false)
    @Size(max = 10)
    private Integer clientId;

    @Column(name = "worker_id", nullable = false)
    @Size(max = 10)
    private Integer workerId;

    @Column(name = "error_date", nullable = false)
    @Size(max = 19)
    private Timestamp errorDate;

    @Column(name = "error_dateneed", nullable = false)
    @Size(max = 19)
    private Timestamp errorDateNeed;

    @Column(name = "error_text", nullable = false)
    @Size(max = 255)
    private String errorText;

    @Column(name = "error_keeping", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] errorKeeping;

    @Column(name = "error_ole", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] errorOle;

    @Column(name = "error_status", nullable = false)
    @Size(max = 10)
    private Integer errorStatus;

    @Column(name = "error_plan", nullable = true, columnDefinition = "DOUBLE PRECISION")
    @Size(max = 53)
    private Double errorPlan;

    @Column(name = "error_fact", nullable = true, columnDefinition = "DOUBLE PRECISION")
    @Size(max = 53)
    private Double errorFact;

    @Column(name = "error_correctiontext", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] errorCorrectionText;

    @Column(name = "projectaccount_id", nullable = true)
    @Size(max = 10)
    private Integer projectAccountId;

    @Column(name = "projectaccountwork_id", nullable = true)
    @Size(max = 10)
    private Integer projectAccountWorkId;

    @Column(name = "error_description", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] errorDescription;

    @Column(name = "errorkind_id", nullable = false)
    @Size(max = 10)
    private Integer errorKindId;

    @Column(name = "errorseverity_id", nullable = true)
    @Size(max = 10)
    private Integer errorSeverityId;

    @Column(name = "error_priority", nullable = false)
    @Size(max = 10)
    private Integer errorPriority;

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

    public Timestamp getErrorDate() {
        return errorDate;
    }

    public void setErrorDate(Timestamp errorDate) {
        this.errorDate = errorDate;
    }

    public Timestamp getErrorDateNeed() {
        return errorDateNeed;
    }

    public void setErrorDateNeed(Timestamp errorDateNeed) {
        this.errorDateNeed = errorDateNeed;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public byte[] getErrorKeeping() {
        return errorKeeping;
    }

    public void setErrorKeeping(byte[] errorKeeping) {
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

    public Double getErrorPlan() {
        return errorPlan;
    }

    public void setErrorPlan(Double errorPlan) {
        this.errorPlan = errorPlan;
    }

    public Double getErrorFact() {
        return errorFact;
    }

    public void setErrorFact(Double errorFact) {
        this.errorFact = errorFact;
    }

    public byte[] getErrorCorrectionText() {
        return errorCorrectionText;
    }

    public void setErrorCorrectionText(byte[] errorCorrectionText) {
        this.errorCorrectionText = errorCorrectionText;
    }

    public Integer getProjectAccountId() {
        return projectAccountId;
    }

    public void setProjectAccountId(Integer projectAccountId) {
        this.projectAccountId = projectAccountId;
    }

    public Integer getProjectAccountWorkId() {
        return projectAccountWorkId;
    }

    public void setProjectAccountWorkId(Integer projectAccountWorkId) {
        this.projectAccountWorkId = projectAccountWorkId;
    }

    public byte[] getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(byte[] errorDescription) {
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

    public Error() {

    }

    public Error(Integer errorId,
                 Integer errorTypeId,
                 Integer projectId,
                 Integer clientId,
                 Integer workerId,
                 Timestamp errorDate,
                 Timestamp errorDateNeed,
                 String errorText,
                 byte[] errorKeeping,
                 byte[] errorOle,
                 Integer errorStatus,
                 Double errorPlan,
                 Double errorFact,
                 byte[] errorCorrectionText,
                 Integer projectAccountId,
                 Integer projectAccountWorkId,
                 byte[] errorDescription,
                 Integer errorKindId,
                 Integer errorSeverityId,
                 Integer errorPriority) {
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
        this.projectAccountId = projectAccountId;
        this.projectAccountWorkId = projectAccountWorkId;
        this.errorDescription = errorDescription;
        this.errorKindId = errorKindId;
        this.errorSeverityId = errorSeverityId;
        this.errorPriority = errorPriority;
    }
}
