package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "CapCodeType")
public class MainCapCodeType {
    @Id
    @Column(name = "CapCodeType_Id", nullable = false)
    private Integer capCodeTypeId;
    @Size(max = 10)
    @Column(name = "CapCodeType_Code", nullable = false)
    private String capCodeTypeCode;
    @Size(max = 50)
    @Column(name = "CapCodeType_Name", nullable = false)
    private String capCodeTypeName;

    @Column(name = "CapCodeType_Text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] capCodeTypeText;

    public MainCapCodeType() {

    }

    public Integer getCapCodeTypeId() {
        return capCodeTypeId;
    }

    public void setCapCodeTypeId(Integer capCodeTypeId) {
        this.capCodeTypeId = capCodeTypeId;
    }

    public String getCapCodeTypeCode() {
        return capCodeTypeCode;
    }

    public void setCapCodeTypeCode(String capCodeTypeCode) {
        this.capCodeTypeCode = capCodeTypeCode;
    }

    public String getCapCodeTypeName() {
        return capCodeTypeName;
    }

    public void setCapCodeTypeName(String capCodeTypeName) {
        this.capCodeTypeName = capCodeTypeName;
    }

    public byte[] getCapCodeTypeText() {
        return capCodeTypeText;
    }

    public void setCapCodeTypeText(byte[] capCodeTypeText) {
        this.capCodeTypeText = capCodeTypeText;
    }

    public MainCapCodeType(Integer capCodeTypeId, String capCodeTypeCode, String capCodeTypeName, byte[] capCodeTypeText) {
        this.capCodeTypeId = capCodeTypeId;
        this.capCodeTypeCode = capCodeTypeCode;
        this.capCodeTypeName = capCodeTypeName;
        this.capCodeTypeText = capCodeTypeText;
    }
}