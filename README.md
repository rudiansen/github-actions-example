# GitHub Actions Example

This repo contains a sample project which implements GitHub Actions as a CI/CD tool. 

The sample app is developed using Java and [Spring Boot](https://spring.io/projects/spring-boot) framework. The app will be packaged as a Docker image and pushed to [Azure Container Registry](https://azure.microsoft.com/en-us/services/container-registry/) (ACR). Then the Docker image hosted in ACR will be deployed to [Azure Web App for Containers](https://azure.microsoft.com/en-us/services/app-service/containers/).