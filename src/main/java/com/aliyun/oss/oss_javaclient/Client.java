package com.aliyun.oss.oss_javaclient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;

/**
 * Nikesh Gogia - Alibaba Cloud International!
 * Maintained by Nikesh Gogia n.gogia@alibaba-inc.com 
 * Code Written By Nikesh Gogia
 * Java Client Code to upload single file on Object Storage Service of Alibaba Cloud
 */
public class Client 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        System.out.println( "File Uploading on Alibaba Cloud Object Storage Started" );
        
        String key = ""; // Replace this with your key

        String secret = ""; // Replace this with your secret

        // Uses Singapore as an example
        
        String bucketName = ""; // Replace this with your bucket 
        
        String filepath = "C:\\img\\fami.jpg"; // Replace this with your file path
        
        putObject(bucketName, key, filepath, secret);
        
        System.out.println("File Uploaded Successfully");
        
    }
    
    
    public static void putObject(String bucketName, String key, String filePath,String secret) throws FileNotFoundException {
    	
        // Initializes an OSSClient
    	
        String endpoint = "http://oss-ap-southeast-1.aliyuncs.com";
        
        
        OSSClient client = new OSSClient(endpoint, key, secret);
        
        client.createBucket(bucketName);

        // Create Binary File
        File file = new File(filePath);
        InputStream content = new FileInputStream(file);
        // Creates Metadata for the object to upload
        ObjectMetadata meta = new ObjectMetadata();
        // You must set the ContentLength
        meta.setContentLength(file.length());

        // Uploads the object
        PutObjectResult result = client.putObject(bucketName, key, content, meta);

        // Prints the ETag
        System.out.println(result.getETag());
    }
}
