// YellowDuck build pipeline

pipeline {

	agent any

	stages {

		stage("Compile") {
			steps {
				bat 'mvn test'
			}
		}

		stage("Integration testing") {
			steps {
				parallel(
					"wildfly": {
						bat 'mvn -P wildfly verify'
					},
					"payara": {
						bat 'mvn -P payara verify'
					}
				)
			}
		}
   }
}