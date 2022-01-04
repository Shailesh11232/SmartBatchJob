package com.smartbatchjobui.smartbatchjobui.resources;

import com.smartbatchjobui.smartbatchjobui.dto.BatchJobAudit;
import com.smartbatchjobui.smartbatchjobui.dto.BatchJobParameterAudit;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJob;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJobParameter;
import com.smartbatchjobui.smartbatchjobui.services.AuditBatchJobService;
import com.smartbatchjobui.smartbatchjobui.services.CreateBatchJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/")
public class CreateBatchJobResources {

    @Autowired
    CreateBatchJobService createBatchJobService;
     @Autowired
    AuditBatchJobService auditBatchJobService;

    @PostMapping("cbj")
    ResponseEntity<CreateBatchJob>  CreateBJob(@RequestBody CreateBatchJob createBatchJob){
        System.out.println("CreateBatchJob:"+createBatchJob);
        Long batchJobId = createBatchJob.getBatchJobId();
        if(createBatchJob.getBatchJobId() != null &&
                createBatchJob.getBatchJobId()
                        != 0) {

                 System.out.println("batchjob id for update:"+batchJobId);

                 createBatchJobService.deleteAllParameter(batchJobId);

            CreateBatchJob createBatchJobResult =
                    createBatchJobService.createparameter(createBatchJob);
            //////////////////////////////
            BatchJobAudit batchJobAudit =new BatchJobAudit();
            batchJobAudit.setBatchJobId(createBatchJob.getBatchJobId());
            batchJobAudit.setBatchJobName(createBatchJob.getBatchJobName());
            batchJobAudit.setBatchJobType(createBatchJob.getBatchJobType());
            batchJobAudit.setBatchJobDescription(createBatchJob.getBatchJobDescription());
            batchJobAudit.setCreateBatchJobParameter(createBatchJob.getCreateBatchJobParameter());
           // batchJobAudit.setOperation("update");
            // batchJobAudit.setAuditUserId("user");
            //BatchJobAudit batchJobAuditResult =
                 //   createBatchJobService .BatchJobAudit(batchJobAudit);
            BatchJobParameterAudit batchJobperameterAudit = new BatchJobParameterAudit();

            batchJobperameterAudit.setAuditUserId("user1");
            batchJobperameterAudit.setOperation("update");
            BatchJobParameterAudit  batchJobParameterAudit = createBatchJobService.batchJobParameterAudit(batchJobperameterAudit);
            URI location =
                    ServletUriComponentsBuilder.fromCurrentRequestUri()
                            .path("{/id}").buildAndExpand(createBatchJobResult).toUri();
            return ResponseEntity.created(location).body(createBatchJobResult);
        } else {

            CreateBatchJob createBatchJobResult =
                    createBatchJobService.CreateBJob(createBatchJob);
            BatchJobAudit batchJobAudit =new BatchJobAudit();
            batchJobAudit.setBatchJobId(createBatchJob.getBatchJobId());
            batchJobAudit.setBatchJobName(createBatchJob.getBatchJobName());
            batchJobAudit.setBatchJobType(createBatchJob.getBatchJobType());
            batchJobAudit.setBatchJobDescription(createBatchJob.getBatchJobDescription());
            batchJobAudit.setCreateBatchJobParameter(createBatchJob.getCreateBatchJobParameter());
            batchJobAudit.setOperation("create");
            batchJobAudit.setAuditUserId("user");
            BatchJobAudit batchJobAuditResult =
                    createBatchJobService .BatchJobAudit(batchJobAudit);

            URI location =
                    ServletUriComponentsBuilder.fromCurrentRequestUri()
                            .path("{/id}").buildAndExpand(createBatchJobResult).toUri();
            return ResponseEntity.created(location).body(createBatchJobResult);
        }

    }
   // get batch job data by id
    @GetMapping("cbj/{createBatchJobId}")
    ResponseEntity<List<CreateBatchJobParameter>> getIdBatchJob(@PathVariable(
            "createBatchJobId")Long createBatchJobId){
        System.out.println("CreateBatchJobId:"+createBatchJobId);
        List<CreateBatchJobParameter> createBatchJobParametersResult =
                createBatchJobService.getIdBatchJob(createBatchJobId);
        return ResponseEntity.ok().body(createBatchJobParametersResult);
    }
//get data by batchjob id
    @GetMapping("batchData/{BatchJobId}")
    ResponseEntity<CreateBatchJob>  getAllId (@PathVariable(
            "BatchJobId")Long BatchJobId){
        System.out.println("BatchJobId:"+BatchJobId);
        CreateBatchJob createBatchJobResult =
                createBatchJobService.get(BatchJobId);
        return ResponseEntity.ok().body(createBatchJobResult);
    }
    @GetMapping("cbj/allGet")
    ResponseEntity<List<CreateBatchJob>> allGet(){
          List<CreateBatchJob> createBatchJobResult =
                  createBatchJobService.getAllBatchJob();
          return ResponseEntity.ok().body(createBatchJobResult);
    }
    @DeleteMapping("ParameterDelete/{batchJobParameterId}")
    void DeleteParameter(@PathVariable("batchJobParameterId")Long batchJobParameterId){
        createBatchJobService.deleteById(batchJobParameterId);
    }



    @DeleteMapping("BatchJobDelete/{BatchJobId}")
    void  DeleteBatchJob(@PathVariable("BatchJobId") long BatchJobId , CreateBatchJob createBatchJob){
        BatchJobAudit batchJobAudit =new BatchJobAudit();
        batchJobAudit.setBatchJobId(createBatchJob.getBatchJobId());
        batchJobAudit.setBatchJobName(createBatchJob.getBatchJobName());
        batchJobAudit.setBatchJobType(createBatchJob.getBatchJobType());
        batchJobAudit.setBatchJobDescription(createBatchJob.getBatchJobDescription());
        batchJobAudit.setCreateBatchJobParameter(createBatchJob.getCreateBatchJobParameter());
        batchJobAudit.setOperation("delete");
        batchJobAudit.setAuditUserId("user");
        BatchJobAudit batchJobAuditResult =
                createBatchJobService .BatchJobAudit(batchJobAudit);

        createBatchJobService.deleteById(BatchJobId);
    }

}