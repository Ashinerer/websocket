pipeline{
    agent any
    options {
        timeout(time: 20, unit: 'MINUTES')
    }
    stages{
        stage('Test'){
            agent{label 'gradle'}
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
        stage('Build Image'){
            agent{dockerfile true}
            steps{
                sh 'docker build -t demo:v1 .'
                sh 'docker run demo:v1'
            }
        }
    }
}