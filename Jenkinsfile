pipeline {

    agent any
    stages {
    stage('gradle'){
        steps{
            echo 'executing gradle'
            withGradle(){
                bat './gradlew -v'
            }
        }
    }
    }
}