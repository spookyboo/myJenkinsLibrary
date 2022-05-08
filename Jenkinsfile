pipeline {
    environment {
        // Variable used for testing the flow
        main = 'myFeature'
    }
    agent any

    stages {
        stage('Validate entry criteria') {
            steps {
                echo 'Stage: Validate entry criteria'
            }
        }
        stage('Execute build') {
            steps {
                echo 'Stage: Execute build'
            }
        }
        stage('Perform unittests') {
            steps {
                echo 'Stage: Perform unittests'
            }
        }
        stage('Analyze code') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Analyze code'
            }
        }
        stage('Package artifact') {
            steps {
                echo 'Stage: Package artifact'
            }
        }
        stage('Publish artifact') {
            steps {
                echo 'Stage: Publish artifact'
            }
        }
        stage('Provision test environment') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Provision test environment'
            }
        }
        stage('Deploy artifact to test') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Deploy artifact to test'
            }
        }
        stage('Perform test') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Perform test'
            }
        }
        stage('Validate infrastructure compliancy') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Validate infrastructure compliancy'
            }
        }
        stage('Validate exit criteria') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Validate exit criteria'
            }
        }
        stage('Perform dual control') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Perform dual control'
            }
        }
        stage('Provision production infrastructure') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Provision production infrastructure'
            }
        }
        stage('Deploy artifact to production') {
            when {
                branch "${main}"
            }
            steps {
                echo 'Stage: Deploy artifact to production'
            }
        }
    }
    
    // Stage: Notify actor
    post {
        success {
            echo 'Stage: Notify actor - success'
        }
        failure {
            echo 'Stage: Notify actor - failure'
        }
    }
}
