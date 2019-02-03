pipeline{
    agent{
        dockerfile true
    }
    options {
        timeout(time: 20, unit: 'MINUTES')
    }
    stages{
        stage('Test'){
            steps{
                sh 'gradle test -i'
            }
        }
        stage('Build'){
            steps{
                sh 'gradle build -i'
            }
        }
        stage('Jar'){
            steps{
                sh 'gradle shadowJar'
                stash name:'wsClient-1.0', includes:"build/libs/wsClient-1.0.jar"
            }
        }
    }
}