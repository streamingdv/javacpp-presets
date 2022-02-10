JavaCPP Presets for Triton Inference Server
===========================================

[![Gitter](https://badges.gitter.im/bytedeco/javacpp.svg)](https://gitter.im/bytedeco/javacpp) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.bytedeco/tritonserver/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.bytedeco/tritonserver) [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/oss.sonatype.org/org.bytedeco/tritonserver.svg)](http://bytedeco.org/builds/)  
<sup>Build status for all platforms:</sup> [![tritonserver](https://github.com/bytedeco/javacpp-presets/workflows/tritonserver/badge.svg)](https://github.com/bytedeco/javacpp-presets/actions?query=workflow%3Atritonserver)  <sup>Commercial support:</sup> [![xscode](https://img.shields.io/badge/Available%20on-xs%3Acode-blue?style=?style=plastic&logo=appveyor&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAMAAACdt4HsAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAZQTFRF////////VXz1bAAAAAJ0Uk5T/wDltzBKAAAAlUlEQVR42uzXSwqAMAwE0Mn9L+3Ggtgkk35QwcnSJo9S+yGwM9DCooCbgn4YrJ4CIPUcQF7/XSBbx2TEz4sAZ2q1RAECBAiYBlCtvwN+KiYAlG7UDGj59MViT9hOwEqAhYCtAsUZvL6I6W8c2wcbd+LIWSCHSTeSAAECngN4xxIDSK9f4B9t377Wd7H5Nt7/Xz8eAgwAvesLRjYYPuUAAAAASUVORK5CYII=)](https://xscode.com/bytedeco/javacpp-presets)


License Agreements
------------------
By downloading these archives, you agree to the terms of the license agreements for NVIDIA software included in the archives.

### Triton Inference Server
To view the license for Triton Inference Server included in these archives, click [here](https://developer.nvidia.com/ngc/nvidia-deep-learning-container-license)

 * Triton Inference Server is widely used software package for inference service
 * Triton supports almost all kinds of model generated by different DL frameworks or tools, such as TensorFlow, PyTorch, ONNX Runtime, TensorRT, OpenVINO...
 * Triton supports both CPU and GPU
 * Triton can be used both as an application and as a shared library. In case you already have your own inference service framework but want to add more features, just try Triton as a shared library.
 * Triton supports Java as a shared library through JavaCPP Presets


Introduction
------------
This directory contains the JavaCPP Presets module for:

 * Triton Inference Server 2.18.0  https://github.com/triton-inference-server/server

Please refer to the parent README.md file for more detailed information about the JavaCPP Presets.


Documentation
-------------
Java API documentation is available here:

 * http://bytedeco.org/javacpp-presets/tritonserver/apidocs/


Sample Usage
------------
Here is a simple example of Triton Inference Server ported to Java from the `simple.cc` sample file available at:

 * https://github.com/triton-inference-server/server/tree/main/src/servers

We can use [Maven 3](http://maven.apache.org/) to download and install automatically all the class files as well as the native binaries. To run this sample code, after creating the `pom.xml` and `Simple.java` source files from the [`samples/`](samples/) subdirectory, simply execute on the command line:
```bash
 $ mvn compile exec:java -Dexec.args="-r /path/to/models"
```
This sample intends to show how to call the Java-mapped C API of Triton to execute inference requests.

### Steps to run this sample inside an NGC container

 1. Get the source code of Triton Inference Server to prepare the model repository:
```bash
 $ wget https://github.com/triton-inference-server/server/archive/refs/tags/v2.18.0.tar.gz
 $ tar zxvf v2.18.0.tar.gz
 $ cd server-2.18.0/docs/examples/model_repository
 $ mkdir models
 $ cd models; cp -a ../simple .
```
Now, this `models` directory will be our model repository.

 2. Start the Docker container to run the sample (assuming we are under the `models` directory created above):
```bash
 $ docker run -it --gpus=all -v $(pwd):/workspace nvcr.io/nvidia/tritonserver:22.01-py3 bash
 $ apt update
 $ apt install -y openjdk-11-jdk
 $ wget https://archive.apache.org/dist/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.tar.gz
 $ tar zxvf apache-maven-3.8.4-bin.tar.gz
 $ export PATH=/opt/tritonserver/apache-maven-3.8.4/bin:$PATH
 $ git clone https://github.com/bytedeco/javacpp-presets.git
 $ cd javacpp-presets
 $ mvn clean install --projects .,tritonserver
 $ mvn clean install -f platform --projects ../tritonserver/platform -Djavacpp.platform=linux-x86_64
 $ cd tritonserver/samples
 $ mvn compile exec:java -Djavacpp.platform=linux-x86_64 -Dexec.args="-r /workspace/models"
```

This sample is the Java implementation of the simple example written for the [C API](https://github.com/triton-inference-server/server/blob/main/docs/inference_protocols.md#c-api).

### Steps to run any binary linked to Triton Inference Server using JavaCPP inside an NGC container

To run your code, you will need to:

 1. Create `pom.xml` and `<your code>.java` source files, and
 2. Similar to the `pom.xml` for `Simple.java`, execute with:
```bash
 $ mvn compile exec:java
```