package com.smartbatchjobui.smartbatchjobui.resources;

import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJob;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJobParameter;
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


      @PostMapping("cbj")
      ResponseEntity<CreateBatchJob>  CreateBJob(@RequestBody CreateBatchJob createBatchJob){
          System.out.println("CreateBatchJob:"+createBatchJob);
          CreateBatchJob createBatchJobResult = createBatchJobService.CreateBJob(createBatchJob);
          URI location =
                  ServletUriComponentsBuilder.fromCurrentRequestUri()
                          .path("{/id}").buildAndExpand(createBatchJobResult).toUri();
          return ResponseEntity.created(location).body(createBatchJobResult);
    }
    @GetMapping("cbj/{createBatchJobId}")
    ResponseEntity<List<CreateBatchJobParameter>> getIdBatchJob(@PathVariable(
            "createBatchJobId")Long createBatchJobId){
        System.out.println("CreateBatchJobId:"+createBatchJobId);
        List<CreateBatchJobParameter> createBatchJobParametersResult =
                createBatchJobService.getIdBatchJob(createBatchJobId);
        return ResponseEntity.ok().body(createBatchJobParametersResult);
    }

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

    @PutMapping("UpadateParameter/{BatchJobId}")
    ResponseEntity<CreateBatchJobParameter> UpadateParameter(@RequestBody CreateBatchJobParameter createBatchJobParameter,
                                                             @PathVariable("BatchJobId")Long BatchJobId){
        System.out.println("CreateBatchJobParameter:"+createBatchJobParameter);
        CreateBatchJobParameter createBatchJobParameterResult =
                createBatchJobService.UpadetParameter(createBatchJobParameter, BatchJobId);
        URI location =
                ServletUriComponentsBuilder.fromCurrentRequestUri()
                        .path("{/BatchJobId}").buildAndExpand(createBatchJobParameterResult).toUri();
        return ResponseEntity.created(location).body(createBatchJobParameterResult);
    }

    @DeleteMapping("BatchJobDelete/{BatchJobId}")
    void  DeleteBatchJob(@PathVariable("BatchJobId") long BatchJobId){
        createBatchJobService.deleteById(BatchJobId);
    }

}