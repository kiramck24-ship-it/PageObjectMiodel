pipeline {

agent any

stages {

stage('Checkout') {
steps {
checkout scm
}
}

stage('Build and Test') {
steps {
bat 'mvn clean test'
}
}

stage('Check Test Reports') {
steps {
bat 'dir target\\surefire-reports'
}
}
}

post {
always {
junit allowEmptyResults: false,
testResults: 'target/surefire-reports/*.xml'
}
}
}

