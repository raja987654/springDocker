
                  pipeline {
    agent any
    
    tools {
        gradle 'Gradle'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout du code depuis GitHub
                git branch: 'main', 
                    url: 'https://github.com/raja987654/springDocker.git'
              
            }
        }
        
        stage('Build') {
            steps {
                // Build avec Gradle
                bat './gradlew clean build'
            }
        }
        
        stage('Docker Build') {
            steps {
                // Construction de l'image Docker
                bat 'docker build -t spring-app .'
            }
        }
        
        stage('Docker Run') {
            steps {
                // Arrêt du container existant s'il existe
                bat 'docker-compose down || true'
                // Démarrage du nouveau container
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
                
       
