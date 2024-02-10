# Inner Security Filter Spring Boot Starter

Custom Spring Boot Starter containing JwtFilter which uses FeignClient to validate JWT using Security Service. 
Also this repository is used as a Maven repository for this project artifact storage on branch `artifact`. 
Artifact receives an update when the project is deployed locally with

```
mvn clean deploy -Pgithub
```

or after push/pull-request events on branch `main` due to GitHub Actions.
