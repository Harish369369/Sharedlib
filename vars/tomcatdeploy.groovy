def call(ip,credsId,myWar){
  sshagent(["${credsId}"]){
    sh "scp -o StricthostKeyChecking=no target/${myWar}.war ec2-user@${ip}:/opt/tomcat8/bin/webapps/"
  sh ssh "ec2-user@${ip}:/opt/tomcat8/bin/shutdown.sh"
sh ssh "ec2-user@${ip}:/opt/tomcat8/bin/startup.sh"
}
}
