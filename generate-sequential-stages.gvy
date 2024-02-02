def stage_name_list = ["checkout", "build", "package", "deploy"]

pipeline{
    agent 'any'    
    stages{
        stage('CI/CD Pipeline'){
            steps{
                script{
                    for(int i=0; i < stage_name_list.size(); i++){
                        stage(stage_name_list[i] + ' Stage'){
                            echo "Doing " + stage_name_list[i]
                        }
                    }
                }
            }
        }
    }
}
