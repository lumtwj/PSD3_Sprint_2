PSD3 Sprint 2
=============

## Requirements

1. Gradle
  * [1.9 bin](http://services.gradle.org/distributions/gradle-1.9-bin.zip)
2. Spring Tool Suite (STS) 3.4.0
  * [Windows 32-bit](http://download.springsource.com/release/STS/3.4.0/dist/e4.3/spring-tool-suite-3.4.0.RELEASE-e4.3.1-win32-installer.exe)
  * [Windows 64-bit](http://download.springsource.com/release/STS/3.4.0/dist/e4.3/spring-tool-suite-3.4.0.RELEASE-e4.3.1-win32-x86_64-installer.exe)
3. Java Development Kit (Must match STS 32-bit/64-bit)
  * [Windows 32-bit](http://download.oracle.com/otn-pub/java/jdk/7u45-b18/jdk-7u45-windows-i586.exe)
  * [Windows 64-bit](http://download.oracle.com/otn-pub/java/jdk/7u45-b18/jdk-7u45-windows-x64.exe)

---

## How to import project to Spring Tool Suite

1. Use your git client to clone the repository from [PSD3 Sprint 2](https://github.com/mOcentury/PSD3_Sprint_2.git)
2. Import your project from STS
  * File > Import > Gradle Project
3. Select the root folder of the project directory that you have clone from Github
4. Click on "Build Model" after you have select the root folder
5. Make sure the project are selected and click on "Finish"

---

## How to run the project

1. Right click on the project
2. Select run as > Gradle Build
3. Check build and runjar
4. Wait for Spring to start the server, proceed only when you see the following:
 * Started Application in 4.271 seconds
5. The server is up, open your browser and procced to [localhost:8080](http://localhost:8080/NewSession)
