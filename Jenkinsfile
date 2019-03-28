node {
    def app;    
    def namespace = 'graphql';

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    stage('Build docker image') {
      	// sh 'mvn clean install'
      	sh 'mvn clean install'
        
       /* This builds the actual image; synonymous to
        * docker build on the command line */
       app = docker.build("kartikjalgaonkar/graphql_image")
    }

    stage('Push image to docker repo') {
        /* Finally, we'll push the image with two tags:
         * First, the incremental build number from Jenkins
         * Second, the 'latest' tag.
         * Pushing multiple tags is cheap, as all the layers are reused. */
        docker.withRegistry('https://registry.hub.docker.com', 'docker_credentials') {
        app.push("latest")
        }
    }
    
    stage('Deploy to K8s'){
       
        switch (namespace) {
            case "graphql":
                sh("kubectl get ns ${namespace} --kubeconfig=/home/yash/.kube/config || kubectl create namespace ${namespace} --kubeconfig=/home/yash/.kube/config")
                sh("kubectl --namespace=${namespace} apply -f deployment.yml --kubeconfig=/home/yash/.kube/config")
                sh("kubectl --namespace=${namespace} apply -f service.yml --kubeconfig=/home/yash/.kube/config")
                sh ("kubectl --namespace=${namespace} apply -f ingress.yml --kubeconfig=/home/yash/.kube/config")
                break
        }
    }
    

   
}
