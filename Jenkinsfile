#!/usr/bin/env groovy


pipeline {
  def gvyfile
  
  agent {
    any
  }
  
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

        // Load the file 'filestep.groovy' from the current directory, into a variable called "externalMethod".
         grvyfile = load("filestep.groovy")
         // Call the method defined in the goovy file
          grvyfile.cleanUpStage()
      }
    }

  }
}
