# [YellowDuck](https://yellowduck.tech)

[![Build Status](http://jenkins.yellowduck.tech/job/yellow-duck/job/master/badge/icon)](http://jenkins.yellowduck.tech/job/yellow-duck/job/master/)

### About
**YellowDuck** is a modern test manegement system. Key features:
* Manage manual and automated test cases
* Provide powerful test reporting and statistic
* Execute automation tests using different environments
* Written on Java

### Build

```bash
# Without tests
mvn install

#  With tests using WildFly container
mvn -P wildfly install

# With tests using Payara container
mvn -P payara install
```

### Swagger
You can use swagger to explore API and generate client: http://<host>/swagger

