pipeline {
    agent any
    options {
        timeout(time: 20, unit: 'MINUTES')
    }
    stages {
//        stage('Test') {
//            steps {
//                sh './gradlew test -i'
//            }
//        }
//        stage('Build'){
//            steps{
//                sh './gradlew build -i'
//                sh "tar cvf webskt.tar Dockerfile build/libs/wsClient-1.0.jar"
//                stash name: "package", includes: "webskt.tar"
//            }
//        }
        stage('Jar') {
            steps {
                sh './gradlew build -i'
                sh './gradlew shadowJar'
                sh 'ls ./build'
//                sh "tar cvf sample.tar Dockerfile build/libs/wsClient-1.0.jar"
//                stash name:'wsClient-1.0', includes:"build/libs/wsClient-1.0.jar"
                sh "oc apply -f sample.yaml"
                sh "oc start-build sample"
//                sh 'cat Dockerfile | oc new-build --name websocket-build3 --dockerfile=\'-\''
                //sh 'oc start-build websocket-build2'
            }
        }


//        stage('Build Image'){
//
//            steps{
//                sh 'oc create -f sample.yaml'
//
//
//            }
//        }
    }
}