pipeline
{
  agents any
  stages
  {
    stage("Build")
    {
      steps
      {
        echo "build success"
        "mvn clean"
      }
    }
    stage("Compile")
    {
      steps
      {
        echo "compile success"
        "mvn compile"
      }
    }
    stage("Test")
    {
      steps
      {
        echo "test success"
        "mvn test"
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
