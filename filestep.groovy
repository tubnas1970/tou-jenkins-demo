#!groovy

def cleanUpStage(){  
    stage('Cleanup workspace'){
      deleteDir()
    }
}
