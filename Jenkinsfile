// YellowDuck build pipeline

pipeline {

	agent any

	stages {

		stage("Compile") {
			steps {
				sh 'mvn test'
			}
		}

		stage("Integration testing") {
			steps {
				parallel(
					"wildfly": {
						sh 'mvn -P wildfly verify'
					},
					"payara": {
						sh 'mvn -P payara verify'
					},
					"swarm": {
					    sh 'mvn -P swarm verify'
					}
				)
			}
		}

		stage("Package") {
		    steps {
		        sh 'mvn package'
		    }
		}
   }
}