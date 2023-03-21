def newDownload(repo)
{
  git 'https://github.com/sourav88/${repo}'
}
def newBuild()
{
  sh 'mvn package'
}
