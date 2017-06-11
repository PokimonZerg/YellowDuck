// YellowDuck build pipeline

pipeline {

    agent any

	stages {

		stage("Build") {
			steps {
				sh 'mvn clean package'
			}
		}

        stage("Deploy") {
            when {
                expression { env.BRANCH_NAME == 'master' }
            }
            steps {
                sh 'cp -f target/yellowduck-0.1-SNAPSHOT.jar /usr/share/nginx/html/yellowduck.jar'
            }
        }
	}
}