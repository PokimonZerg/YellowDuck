// YellowDuck build pipeline

pipeline {

    agent any

	stages {

		stage("Compile") {
			steps {
				sh 'mvn test'
			}
		}

		stage("IT - Wildfly") {
			steps {
			    sh 'mvn -P wildfly verify'
            }
        }

        stage("IT - Payara") {
            steps {
                sh 'mvn -P payara verify'
            }
        }

        stage("IT - Swarm") {
            steps {
                sh 'mvn -P swarm verify'
            }
        }

        stage("Package") {
            steps {
                sh 'mvn package'
            }
        }
	}
}