@GrabResolver("https://oss.jfrog.org/artifactory/repo")
@Grab("org.ratpack-framework:ratpack-groovy:0.9.0-SNAPSHOT")
import static org.ratpackframework.groovy.RatpackScript.ratpack
import org.ratpackframework.groovy.templating.TemplateRenderer

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
    handlers {
        get {
            response.send "This is the app root (also try: /date and /some.txt)"
        }

        get("date") {
            get(TemplateRenderer).render "date.html"
        }

        assets "public"
    }
}
