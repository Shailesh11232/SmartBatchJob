package com.smartbatchjobui.smartbatchjobui.dto;

import java.util.List;

public class BatchJobDetail {
    String batchJobName;
    List<CreateBatchJobParameter> createBatchJobParameter;
    public BatchJobDetail(){}
    public BatchJobDetail(String batchJobName, List<CreateBatchJobParameter> createBatchJobParameter) {
        this.batchJobName = batchJobName;
        this.createBatchJobParameter = createBatchJobParameter;
    }
    @Override
    public String toString() {
        return "BatchJobDetail{" +
                "batchJobName='" + batchJobName + '\'' +
                ", createBatchJobParameter=" + createBatchJobParameter+
                '}';
    }

    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public List<CreateBatchJobParameter> getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(List<CreateBatchJobParameter> createBatchJobParameter) {
        this.createBatchJobParameter= createBatchJobParameter;
    }
}
