def call(conf){
  def repoName = conf["repoName"]
  def pomFile = readMavenPom file: 'pom.xml'
  def version = pomFile.version
  def artifact Id = pomFile.artifactId
  def type = pomFile.packaging
  def groupId = pom.File.groutId
  nexusArtifactUploader artifacts: [[artifactId: "${artifactId}", classifier: '', file: "target/${artifactId}-${version}.war", type: type]], credentialsId: 'Nexus3', groupId: groupId, nexusUrl: '13.232.36.145:8081/', nexusVersion: 'nexus3', protocol: 'http', repository: repoName, version: "${version}"
  
