package com.duoc.guiasdespacho.service;

import com.duoc.guiasdespacho.model.Asset;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface AwsService {

    String getS3FileContent(String bucketName, String fileName) throws IOException;

    List<Asset> getS3Files(String bucketName)throws IOException;

    byte[] downloadFile(String bucketName, String fileName) throws IOException;

    void moveObject(String bucketName, String fileKey, String destinationFileKey);

    void deleteObject(String bucketName, String fileKey);

    String uploadFile(String bucketName, String fileKey, MultipartFile file);

    void validarBucket(String bucketName);

    public List<Asset> filtrarGuias(String bucketName, String fecha, Long transportista) throws IOException;

}
