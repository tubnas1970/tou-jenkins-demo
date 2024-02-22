def grvy

def generateStage2(nodeLabel) {
    return {
        stage("Runs on ${nodeLabel}") { 
            node(nodeLabel) {
                echo "Running on node: ${nodeLabel}"
            }
        }
    }
}

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
        script {
          grvy = load "filestep.groovy"
          grvy.cleanUpStage()
        }
      }
    }

    stage('Last Stage') {
      steps {
        script {
          generateStage2("mynode")
        }
      }
    }    

  } // stages
} // pipeline
