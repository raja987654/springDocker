
         pipeline {
    agent any
    
    tools {
        gradle 'Gradle'
    }
    
   
    
    triggers {
        githubPush()
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                   
                    url: 'https://github.com/raja987654/springDocker.git'
            }
        }
        
        stage('Build') {
            steps {
                bat './gradlew clean build'
            }
        }
        
        stage('Docker Build') {
            steps {
                bat 'docker build -t spring-app .'
            }
        }
        
        stage('Docker Run') {
            steps {
                bat 'docker-compose down || true'
                bat 'docker-compose up -d'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline exécuté avec succès!'
        }
        failure {
            echo 'Pipeline échoué!'
        }
      
        }
    
}
