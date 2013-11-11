@GrabResolver("https://oss.jfrog.org/artifactory/repo")
@Grab("io.ratpack:ratpack-groovy:0.9.0-SNAPSHOT")
import static ratpack.groovy.Groovy.*

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
    handlers {
        get {
            response.send "This is the app root (also try: /date and /some.txt)"
        }

        get("date") {
            render groovyTemplate("date.html")
        }

        assets "public"
    }
}
