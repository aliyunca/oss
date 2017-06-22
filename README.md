# Alibaba Cloud Object Storage Java Client
# oss_javaclient
Java Client Code by Nikesh Gogia for Alibaba Cloud 

# Leverage this Client Code written in Java for uploading your images,file as Object on Alibaba Cloud OSS (Object Storage As Service)

# Pre-Requiste
1. Alibaba Cloud Account
2. Object Storage Service Enabled
3. Object Storage Access Control

#On Local Machine
JDK 1.8
Maven

# To run this locally

1. Open the  oss_client.java file in src folder and replace key, secret & bucket name.

        String key = ""; // Replace this with your key

        String secret = ""; // Replace this with your secret
        
        // Uses Singapore as an example

        String bucketName = ""; // Replace this with your bucket 
        
        String filepath = "C:\\img\\pic.jpg"; // Replace this with your file path
        
 2. Once you replace above values, make folder in C: with img you put pic.jpeg (any image). You are free to create your own directory structure and image name.
 
 3. Once you do that, you need to run oss_client java file. Once it uploads it successfully then you can in web console of Object Storage and select bucket and click Object Management on left side menu.
 
 
