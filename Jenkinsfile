pipeline
{
  agent any
  stages
  {
    stage("Build")
    {
      steps
      {
        echo "build success"
        bat "mvn clean"
      }
    }
    stage("Compile")
    {
      steps
      {
        echo "compile success"
        bat "mvn compile"
      }
    }
    stage("Test")
    {
      steps
      {
        echo "test success"
        bat "mvn test"
      }
    }
    stage("Deploy")
    {
      steps
      {
        echo "deploy success"
      }
    }
  }
}
