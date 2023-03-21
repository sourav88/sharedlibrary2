def newDownload(repo)
{
  git "https://github.com/sourav88/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def newTest(jobname1)
{
  sh " java -jar /var/lib/jenkins/workspace/${jobname1}/testing.jar"
}
