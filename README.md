# YellowDuck

[![Build Status](http://195.161.62.109:8080/job/yellow-duck/badge/icon)](http://195.161.62.109:8080/job/yellow-duck/)

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
