job("Helloworld-war via seed DSL") {
    description "Builds helloworld-war job on ${new Date()} via seed DSL"
    scm {
        git("git@github.com:y16me91o/practice.git",helloworld-war-seed)
        
    }
    steps {
        shell "Look: I'm building helloworld-war-seed!"
        maveen('clean package')
    }
    publishers{
        archiveArtifacts '**/*.war'
    }
}
