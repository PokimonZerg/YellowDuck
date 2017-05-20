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

        stage("Deploy") {
            when {
                expression { env.BRANCH_NAME == 'master' }
            }
            steps {
                sh 'cp -f target/yellowduck-0.1-SNAPSHOT.war /usr/share/nginx/html/yellowduck.war'
                sh 'cp -f target/yellowduck-0.1-SNAPSHOT-swarm.jar /usr/share/nginx/html/yellowduck-swarm.jar'
            }
        }
	}
}