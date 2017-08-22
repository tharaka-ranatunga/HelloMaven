pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'set'
            }
        }
	stage('SonarQube analysis') {
    		withSonarQubeEnv('My SonarQube Server') {
      		// requires SonarQube Scanner for Maven 3.2+
      		bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
    		}
  	}
    }
}