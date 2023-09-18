package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "CapCode")
public class CapCode {
    @Id
    @Size(max = 10)
    @Column(name = "CapCode_Id", nullable = false)
    private Integer capCodeId;
    @Size(max = 10)
    @Column(name = "CapCodeType_Id", nullable = false)
    private String CapCodeTypeId;
    @Size(max = 10)
    @Column(name = "CapCode_Code", nullable = false)
    private String CapCodeCode;

    @Size(max = 50)
    @Column(name = "CapCode_Name", nullable = false)
    private String CapCodeName;

    @Size(max = 10)
    @Column(name = "CapCode_SortCode", nullable = true)
    private String CapCodeSortCode;

    @Column(name = "CapCode_Text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] CapCodeText;

    public Integer getCapCodeId() {
        return capCodeId;
    }

    public void setCapCodeId(Integer capCodeId) {
        capCodeId = capCodeId;
    }

    public String getCapCodeTypeId() {
        return CapCodeTypeId;
    }

    public void setCapCodeTypeId(String capCodeTypeId) {
        CapCodeTypeId = capCodeTypeId;
    }

    public String getCapCodeCode() {
        return CapCodeCode;
    }

    public void setCapCodeCode(String capCodeCode) {
        CapCodeCode = capCodeCode;
    }

    public String getCapCodeName() {
        return CapCodeName;
    }

    public void setCapCodeName(String capCodeName) {
        CapCodeName = capCodeName;
    }

    public String getCapCodeSortCode() {
        return CapCodeSortCode;
    }

    public void setCapCodeSortCode(String capCodeSortCode) {
        CapCodeSortCode = capCodeSortCode;
    }

    public byte[] getCapCodeText() {
        return CapCodeText;
    }

    public void setCapCodeText(byte[] capCodeText) {
        CapCodeText = capCodeText;
    }

    public CapCode() {

    }

    public CapCode(Integer capCodeId, String capCodeTypeId, String capCodeCode, String capCodeName, String capCodeSortCode, byte[] capCodeText) {
        this.capCodeId = capCodeId;
        CapCodeTypeId = capCodeTypeId;
        CapCodeCode = capCodeCode;
        CapCodeName = capCodeName;
        CapCodeSortCode = capCodeSortCode;
        CapCodeText = capCodeText;
    }

}
