def cleanUpStage(){
  echo '========== hi there ========'
}

def generateStage(nodeLabel) {
    return {
        stage("Runs on ${nodeLabel}") { 
            node(nodeLabel) {
                echo "Running on node: ${nodeLabel}"
            }
        }
    }
}


