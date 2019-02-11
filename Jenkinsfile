pipeline{
    agent any
    options {
        timeout(time: 20, unit: 'MINUTES')
    }
    stages{
        stage('Test') {
            steps {
                sh './gradlew test -i'
            }
        }
        stage('Jar'){
            steps{
                sh './gradlew shadowJar'
                stash name:'wsClient-1.0', includes:"build/libs/wsClient-1.0.jar"
            }
        }
        stage('Build'){
            steps{
                sh './gradlew build -i'
//                sh "tar cvf webskt.tar Dockerfile build/libs/wsClient-1.0.jar"
//                stash name: "package", includes: "webskt.tar"
            }
        }
        stage('Build Image'){

            steps{
                sh 'oc create -f sample.yaml'

            }
        }
    }
}