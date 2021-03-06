package com.smartbatchjobui.smartbatchjobui.dto;

import java.util.List;

public class CreateBatchJob {

    private Long batchJobId ;
    private String batchJobName;
    private String batchJobDescription ;
    private String batchJobType ;
    private List<CreateBatchJobParameter> createBatchJobParameter ;
    public CreateBatchJob(){

    }

    public CreateBatchJob(Long batchJobId, String batchJobName, String batchJobDescription,
                          String batchJobType, List<CreateBatchJobParameter> createBatchJobParameter) {
        this.batchJobId = batchJobId;
        this.batchJobName = batchJobName;
        this.batchJobDescription = batchJobDescription;
        this.batchJobType = batchJobType;
        this.createBatchJobParameter = createBatchJobParameter;
    }


    public Long getBatchJobId() {
        return batchJobId;
    }

    @Override
    public String toString() {
        return "CreateBatchJob{" +
                "batchJobId=" + batchJobId +
                ", batchJobName='" + batchJobName + '\'' +
                ", batchJobDescription='" + batchJobDescription + '\'' +
                ", batchJobType='" + batchJobType + '\'' +
                ", createBatchJobParameter=" + createBatchJobParameter +
                '}';
    }

    public void setBatchJobId(Long batchJobId) {
        this.batchJobId = batchJobId;
    }


    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public String getBatchJobDescription() {
        return batchJobDescription;
    }

    public void setBatchJobDescription(String batchJobDescription) {
        this.batchJobDescription = batchJobDescription;
    }

    public String getBatchJobType() {
        return batchJobType;
    }

    public void setBatchJobType(String batchJobType) {
        this.batchJobType = batchJobType;
    }

    public List<CreateBatchJobParameter> getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(List<CreateBatchJobParameter> createBatchJobParameter) {
        this.createBatchJobParameter = createBatchJobParameter;
    }
}