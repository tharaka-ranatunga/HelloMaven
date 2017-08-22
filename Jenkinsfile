pipeline {
  agent any
  stages {
    stage('SonarQube analysis') {
      steps {
        script {
          // requires SonarQube Scanner 2.8+
          scannerHome = tool 'sonar-scanner'
        }
        withSonarQubeEnv('SonarQube') {
          bat "${scannerHome}/bin/sonar-scanner"
        }
      }
    }
  }
}