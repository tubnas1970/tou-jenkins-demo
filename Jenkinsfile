def grvy

pipeline {
  
  agent any
  
  stages {
    stage('Build Stage') {
      steps {
        checkout scm
        echo "building"
      }
    }
    stage('Test') {
      steps {
        echo "testing"
      }
    }
    stage('Deploy Stage') {
      steps {
        echo "deploying"
        script
          grvy = load "filestep.groovy"
          grvy.cleanUpStage()
        }
      }
    }
    stage('Closing Stage') {
      script {
        grv.closingStep()
      }
    }
    

  } 
}
