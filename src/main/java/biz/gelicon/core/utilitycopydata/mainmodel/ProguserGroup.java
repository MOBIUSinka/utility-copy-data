package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Table(name = "ProguserGroup")
public class ProguserGroup {
    @Id
    @Column(name = "ProguserGroup_Id", nullable = false)
    private Integer ProguserGroupId;
    @Size(max = 50)
    @Column(name = "ProguserGroup_Note", nullable = true)
    private String CapCodeTypeCode;
    @Size(max = 30)
    @Column(name = "ProguserGroup_Name", nullable = false)
    private String ProguserGroupName;

    @Column(name = "ProguserGroup_Visible", nullable = false)
    private Integer ProguserGroupVisible;

    public Integer getProguserGroupId() {
        return ProguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        ProguserGroupId = proguserGroupId;
    }

    public String getCapCodeTypeCode() {
        return CapCodeTypeCode;
    }

    public void setCapCodeTypeCode(String capCodeTypeCode) {
        CapCodeTypeCode = capCodeTypeCode;
    }

    public String getProguserGroupName() {
        return ProguserGroupName;
    }

    public void setProguserGroupName(String proguserGroupName) {
        ProguserGroupName = proguserGroupName;
    }

    public Integer getProguserGroupVisible() {
        return ProguserGroupVisible;
    }

    public void setProguserGroupVisible(Integer proguserGroupVisible) {
        ProguserGroupVisible = proguserGroupVisible;
    }

    public ProguserGroup(Integer proguserGroupId, String capCodeTypeCode, String proguserGroupName, Integer proguserGroupVisible) {
        ProguserGroupId = proguserGroupId;
        CapCodeTypeCode = capCodeTypeCode;
        ProguserGroupName = proguserGroupName;
        ProguserGroupVisible = proguserGroupVisible;
    }
}
