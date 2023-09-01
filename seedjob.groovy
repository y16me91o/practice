job("Helloworld-war via seed DSL") {
    description "Builds helloworld-war job on ${new Date()} via seed DSL"
    scm {
        git {
          remote {
            url("https://github.com/y16me91o/practice.git")
          }
          branch('helloworld-war-seed')
        }
    }
    steps {
        maven('clean package')
    }
    publishers{
        archiveArtifacts '**/*.war'
    }
}
