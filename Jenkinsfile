node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/tharaka-ranatunga/HelloMaven.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'Maven'
   }
   stage('Build') {
      //Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
          bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
//   stage('Results') {
//       junit '**/target/surefire-reports/TEST-*.xml'
//       archive 'target/*.jar'
//   }

stage('SonarQube analysis') {
        script {
          // requires SonarQube Scanner 2.8+
          scannerHome = tool 'sonar-scanner'
        }
        withSonarQubeEnv('SonarQube') {
          bat "${scannerHome}/bin/sonar-scanner"
        }
    }
}



// pipeline {
//   agent { docker 'maven:3.5.0' }
//   stages {
//     stage('build') {
//         steps {
//                 bat 'mvn --version'
//             }
//         }
    
//   }
// }