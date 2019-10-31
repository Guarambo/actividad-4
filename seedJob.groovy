folder_name = "Actividad-4"
jenkinsfile_angular_folder = "angular_jenkins"
jenkinsfile_java_folder = "java_jenkins"

pipeline_angular_name = "${folder_name}/angular-project"
pipeline_java_name = "${folder_name}/java-project"

url_repo = "https://github.com/Guarambo/actividad-4.git"
repo_name = "Actividad-4"


folder(folder_name) {
    displayName('Actividad-4')
    description('Actividad con WAS y PORTAL')
}

pipelineJob(pipeline_angular_name) {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name(repo_name)
                        url(url_repo)
                    }
                }
                scriptPath("${jenkinsfile_angular_folder}/Jenkinsfile")
            }
        }
    }
}

pipelineJob(pipeline_java_name) {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name(repo_name)
                        url(url_repo)
                    }
                }
                scriptPath("${jenkinsfile_java_folder}/Jenkinsfile")
            }
        }
    }
}