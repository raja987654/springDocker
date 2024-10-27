pipeline {
    agent any

    tools {
        gradle 'Gradle'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t spring-demo .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}