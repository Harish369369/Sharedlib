def call(ip,credsid,myweb){
  sshagent(["${credsid}"]) {
    sh "scp -o StrictHostKeyChecking=no target/${warname}*.war ec2-user@${ip}:/opt/tomcat8/webapps/"
  sh "ssh ec2-user@${ip} /opt/tomcat8/bin/startup.sh"
}
}
