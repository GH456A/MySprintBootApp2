pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the Project with Maven Compiler'
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the Project with Maven Test'
                java MySprintBootApp2.java
            }
        }
        
    }
}
