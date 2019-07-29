pipeline {
  agent {
    label 'java'
  } 
  
  options {
    disableConcurrentBuilds()
  }

  
  stages{
    stage('Build & Test'){
      steps{
        script{
          container('java'){
            sh 'mvn clean package test'
          }
        }
      }
    }
    
    stage('Only for demo'){
      when {
        allOf {
          branch 'master'
        }
      }
      steps{
        echo 'sf'
      }
    }
  }
  
  post{
    always{
      junit 'target/surefire-reports/**/*.xml'
    }
  }
}
