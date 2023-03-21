def newdownload(repo)
{
  git 'https://github.com/sourav88/{repo}.git'
}
def newBuild()
{
  sh 'mvn package'
}
