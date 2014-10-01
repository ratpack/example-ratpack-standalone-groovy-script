@GrabResolver("https://oss.jfrog.org/artifactory/repo")
@Grab("io.ratpack:ratpack-groovy:0.9.9")
import static ratpack.groovy.Groovy.ratpack
import static ratpack.groovy.Groovy.groovyMarkupTemplate
import ratpack.groovy.markuptemplates.MarkupTemplatingModule

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
    bindings {
        add new MarkupTemplatingModule()
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
