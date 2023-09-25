package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ErrorTransitType")
public class ErrorTransitType {
    @Id
    @Column(name = "ErrorTransitType_Id", nullable = false)
    private Integer ErrorTransitTypeId;

    @Size(max = 10)
    @Column(name = "ErrorTransitType_Code", nullable = false)
    private String ErrorTransitTypeCode;
    @Size(max = 50)
    @Column(name = "ErrorTransitType_Name", nullable = false)
    private String ErrorTransitTypeName;

    @Column(name = "ErrorTransitType_Direction", nullable = true)
    private Integer ErrorTransitTypeDirection;


    @Column(name = "TowHom_Id", nullable = false)
    private Integer TowHomId;

    @Column(name = "WithErrorTransitType_Id", nullable = true)
    private Integer WithErrorTransitTypeId;

    @Column(name = "ErrorTransitType_Sendtoskv", nullable = false)
    private Integer ErrorTransitTypeSendtoskv;
    @Column(name = "ErrorTransitType_Module", nullable = false)
    private Integer ErrorTransitTypeModule;
    @Column(name = "ErrorTransitType_Result", nullable = false)
    private Integer ErrorTransitTypeResult;
    @Column(name = "ErrorTransitType_Descript", nullable = false)
    private Integer ErrorTransitTypeDescript;
    @Column(name = "ErrorTransitType_Close", nullable = false)
    private Integer ErrorTransitTypeClose;

    @Column(name = "ErrorTransitType_Notificexcl", nullable = false)
    private Integer ErrorTransitTypeNotificexcl;

    public Integer getErrorTransitTypeId() {
        return ErrorTransitTypeId;
    }

    public void setErrorTransitTypeId(Integer errorTransitTypeId) {
        ErrorTransitTypeId = errorTransitTypeId;
    }

    public String getErrorTransitTypeCode() {
        return ErrorTransitTypeCode;
    }

    public void setErrorTransitTypeCode(String errorTransitTypeCode) {
        ErrorTransitTypeCode = errorTransitTypeCode;
    }

    public String getErrorTransitTypeName() {
        return ErrorTransitTypeName;
    }

    public void setErrorTransitTypeName(String errorTransitTypeName) {
        ErrorTransitTypeName = errorTransitTypeName;
    }

    public Integer getErrorTransitTypeDirection() {
        return ErrorTransitTypeDirection;
    }

    public void setErrorTransitTypeDirection(Integer errorTransitTypeDirection) {
        ErrorTransitTypeDirection = errorTransitTypeDirection;
    }

    public Integer getTowHomId() {
        return TowHomId;
    }

    public void setTowHomId(Integer towHomId) {
        TowHomId = towHomId;
    }

    public Integer getWithErrorTransitTypeId() {
        return WithErrorTransitTypeId;
    }

    public void setWithErrorTransitTypeId(Integer withErrorTransitTypeId) {
        WithErrorTransitTypeId = withErrorTransitTypeId;
    }

    public Integer getErrorTransitTypeSendtoskv() {
        return ErrorTransitTypeSendtoskv;
    }

    public void setErrorTransitTypeSendtoskv(Integer errorTransitTypeSendtoskv) {
        ErrorTransitTypeSendtoskv = errorTransitTypeSendtoskv;
    }

    public Integer getErrorTransitTypeModule() {
        return ErrorTransitTypeModule;
    }

    public void setErrorTransitTypeModule(Integer errorTransitTypeModule) {
        ErrorTransitTypeModule = errorTransitTypeModule;
    }

    public Integer getErrorTransitTypeResult() {
        return ErrorTransitTypeResult;
    }

    public void setErrorTransitTypeResult(Integer errorTransitTypeResult) {
        ErrorTransitTypeResult = errorTransitTypeResult;
    }

    public Integer getErrorTransitTypeDescript() {
        return ErrorTransitTypeDescript;
    }

    public void setErrorTransitTypeDescript(Integer errorTransitTypeDescript) {
        ErrorTransitTypeDescript = errorTransitTypeDescript;
    }

    public Integer getErrorTransitTypeClose() {
        return ErrorTransitTypeClose;
    }

    public void setErrorTransitTypeClose(Integer errorTransitTypeClose) {
        ErrorTransitTypeClose = errorTransitTypeClose;
    }

    public Integer getErrorTransitTypeNotificexcl() {
        return ErrorTransitTypeNotificexcl;
    }

    public void setErrorTransitTypeNotificexcl(Integer errorTransitTypeNotificexcl) {
        ErrorTransitTypeNotificexcl = errorTransitTypeNotificexcl;
    }

    public ErrorTransitType(Integer errorTransitTypeId, String errorTransitTypeCode, String errorTransitTypeName, Integer errorTransitTypeDirection, Integer towHomId, Integer withErrorTransitTypeId, Integer errorTransitTypeSendtoskv, Integer errorTransitTypeModule, Integer errorTransitTypeResult, Integer errorTransitTypeDescript, Integer errorTransitTypeClose, Integer errorTransitTypeNotificexcl) {
        ErrorTransitTypeId = errorTransitTypeId;
        ErrorTransitTypeCode = errorTransitTypeCode;
        ErrorTransitTypeName = errorTransitTypeName;
        ErrorTransitTypeDirection = errorTransitTypeDirection;
        TowHomId = towHomId;
        WithErrorTransitTypeId = withErrorTransitTypeId;
        ErrorTransitTypeSendtoskv = errorTransitTypeSendtoskv;
        ErrorTransitTypeModule = errorTransitTypeModule;
        ErrorTransitTypeResult = errorTransitTypeResult;
        ErrorTransitTypeDescript = errorTransitTypeDescript;
        ErrorTransitTypeClose = errorTransitTypeClose;
        ErrorTransitTypeNotificexcl = errorTransitTypeNotificexcl;
    }

    public ErrorTransitType() {
    }
}