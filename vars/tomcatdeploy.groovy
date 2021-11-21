def call(ip,credsId,myweb){
sshagent(['tomcat-dev']){
sh "scp -o StricthostKeyChecking=no target/myweb.war ec2-user@3.110.94.187:/opt/tomcat8/bin/webapps/"
sh ssh "ec2-user@3.110.94.187:/opt/tomcat8/bin/shutdown.sh"
sh ssh "ec2-user@3.110.94.187:/opt/tomcat8/bin/startup.sh"
}
}
