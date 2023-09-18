package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ProguserGroup")
public class ProguserGroup {
    @Id
    @Size(max = 10)
    @Column(name = "ProguserGroup_Id", nullable = false)
    private Integer proguserGroupId;
    @Size(max = 50)
    @Column(name = "ProguserGroup_Note", nullable = true)
    private String ProguserGroupNote;
    @Size(max = 30)
    @Column(name = "ProguserGroup_Name", nullable = false)
    private String ProguserGroupName;

    @Size(max = 10)
    @Column(name = "ProguserGroup_Visible", nullable = false)
    private Integer ProguserGroupVisible;

    public Integer getProguserGroupId() {
        return proguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        proguserGroupId = proguserGroupId;
    }

    public String getProguserGroupNote() {
        return ProguserGroupNote;
    }

    public void setProguserGroupNote(String proguserGroupNote) {
        ProguserGroupNote = proguserGroupNote;
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

    public ProguserGroup(Integer proguserGroupId, String proguserGroupNote, String proguserGroupName, Integer proguserGroupVisible) {
        this.proguserGroupId = proguserGroupId;
        ProguserGroupNote = proguserGroupNote;
        ProguserGroupName = proguserGroupName;
        ProguserGroupVisible = proguserGroupVisible;
    }

    public ProguserGroup() {
    }
}
