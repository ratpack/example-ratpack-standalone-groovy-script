@GrabResolver(name = "Sonatype OSS Snapshots", root = "https://oss.sonatype.org/content/repositories/snapshots", m2Compatible = true)
@Grab("org.ratpack-framework.netty:ratpack-groovy:0.7.0-SNAPSHOT")
import static org.ratpackframework.groovy.Ratpack.ratpack
ratpack()
