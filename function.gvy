def print_hello(){
    echo "Hello"
}
pipeline{
    agent 'any'
    stages{
        stage('Function - Print hello'){
            steps{
                print_hello()
            }
        }
    }
}