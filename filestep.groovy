def cleanUpStage(){
  echo '========== hi there ========'
}

def closingStep() {
  return steps {
        echo "closing"
  }
}

return this
