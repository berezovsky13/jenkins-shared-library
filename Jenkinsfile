pipeline{
    agent any
    parameters{
        choice(name: 'ENVIRONMENT', choice:['dev','stage','prod'], description: 'Select the environment')
        booleanParam(name:'CONFIRM_PRODUCTION', defaultValue: false, description:'Confirm deployment to production')
    }
    stages{
        stage('Print the Message'){
            steps{
                script{
                    if(params.ENVIRONMENT == 'prod' && !params.CONFIRM_PRODUCTION){
                        error('Prodcition needs confirmation')
                    }

                    echo "Deploying to ${params.ENVIRONMENT}"

                }
                
                
            }
        }
    }
}