def call(conf){
  def repoName = conf["repoName"]
  def pomFile = readMavenPom file: 'pom.xml'
  def version = pomFile.version
  def artifactId = pomFile.artifactId
  def type = pomFile.packaging
  def groupId = pom.File.groutId
  nexusArtifactUploader artifacts: [[artifactId: "${artifactId}", classifier: '', file: "target/${artifactId}-${version}.war", type: type]], credentialsId: 'Nexus3', groupId: groupId, nexusUrl: '172.31.42.247/8081', nexusVersion: 'nexus3', protocol: 'http', repository: repoName, version: "${version}"
}
