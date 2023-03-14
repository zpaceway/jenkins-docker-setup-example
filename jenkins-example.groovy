pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                dir('/app/tests') {
                    sh 'sh build.sh'
                }
            }
        }
        stage('Test') {
            steps {
                dir('/app/tests') {
                    sh 'python3 -m unittest tests.py'
                }
            }
        }
        stage('Deploy') {
            steps {
                dir('/app/tests') {
                    sh 'sh deploy.sh'
                }
            }
        }
    }
}
