// YellowDuck build pipeline

pipeline {

	agent any

	stages {

		stage("Compile") {
			steps {
				bat 'mvn compile'
			}
		}

		stage("Unit testing") {
		    steps {
			    bat 'mvn test'
		    }
		}

		stage("Integration testing - wildfly") {
			steps {
				bat 'mvn -P wildfly verify'
			}
		}

		stage("Integration testing - payara") {
		    steps {
			    bat 'mvn -P payara verify'
		    }
		}
   }
}