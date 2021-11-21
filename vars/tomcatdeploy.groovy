def call(ip,credsId,warName){
  sshagent(["${credsId}"]){
    sh "+ scp -o StricthostKeyChecking=no target/myweb-0.0.2.war ec2-user@3.110.94.187:/opt/tomcat8/bin/webapps"
    sh ssh "ec2-user@${ip}:/opt/tomcat8/bin/shutdown.sh"
    sh ssh "ec2-user@${ip}:/opt/tomcat8/bin/startup.sh"
}
}
