pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS_USR = 'ahmedtlich'
        DOCKERHUB_CREDENTIALS_PWD = 'dockerdocker123'
    }
    stages{
        stage('Checkout GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'AhmedTlich-5NIDS1-G4',
                url : 'https://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@github.com/ahmed1199/5NIDS1-G4-kaddem';
            }
        }
        stage('Build / Compile') {
            steps {
                echo 'Building the project with Maven...';
                sh 'mvn clean package'
            }
        }
        stage('JUnit / Mockito') {
            steps {
                sh 'mvn compile test'
            }
        }
        stage('SonarQube'){
            steps{
                   withSonarQubeEnv('sonarserver') {
                        sh 'mvn sonar:sonar'
                }
            }
        }
        stage('Nexus') {
            steps {
                sh 'mvn deploy'
            }
        }
        stage('Docker Image') {
            steps {
                sh 'docker build -t ahmedtlich/ahmedtlich-5nids1-g4-kaddem . -f Dockerfile';
            }
        }
        stage('Docker hub') {
             steps {//sh 'echo image_pushed'
                 sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PWD'
                 sh 'docker push ahmedtlich/ahmedtlich-5nids1-g4-kaddem'
                 }
        }
        stage('Docker Compose') {
            steps {
                sh 'docker compose up -d';
            }
        }
    }
}