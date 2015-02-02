@GrabResolver(name="netty snapshots", root="http://clinker.netty.io/nexus/content/repositories/snapshots")
@GrabResolver(name="OJO", root="https://oss.jfrog.org/artifactory/repo")
@Grab("io.ratpack:ratpack-groovy:0.9.13")
import static ratpack.groovy.Groovy.ratpack
import static ratpack.groovy.Groovy.groovyMarkupTemplate
import ratpack.groovy.template.MarkupTemplateModule

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
    bindings {
        add new MarkupTemplateModule()
    }
    handlers {
        get {
            response.send "This is the app root (also try: /date and /some.txt)"
        }

        get("date") {
            render groovyMarkupTemplate("date.gtpl")
        }

        assets "public"
    }
}
