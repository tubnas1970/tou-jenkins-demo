#!/usr/bin/env groovy


pipeline {
  //def gvyfile
  
  agent any
  
  stages {
    stage('Build') {
      steps {
        checkout scm
        echo "building"
        def util = load("filestep.groovy")
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
        util.cleanUpStage()

      }
    }

  }
}
