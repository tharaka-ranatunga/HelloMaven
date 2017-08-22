pipeline {
  agent any
  stages {
    stage('Build') {
         steps {
            sh './jenkins_build.sh'
            junit '*/build/test-results/*.xml'
            step( [ $class: 'JacocoPublisher' ] )
         }
    }
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