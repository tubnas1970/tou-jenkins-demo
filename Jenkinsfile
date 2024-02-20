#!/usr/bin/env groovy


pipeline {
  //def gvyfile
  
  agent any
  
  stages {
    stage('Build') {
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
    stage('Deploy') {
      steps {
        echo "deploying"
        script {
          util = load "filestep.groovy"
          util.cleanUpStage()
        }

      }
    }

  }
}
