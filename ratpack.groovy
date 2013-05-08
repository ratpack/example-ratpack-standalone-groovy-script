@GrabResolver(name = "Sonatype OSS Snapshots", root = "https://oss.sonatype.org/content/repositories/snapshots", m2Compatible = true)
@Grab(value = "org.ratpack-framework:ratpack-groovy:0.7.0-SNAPSHOT", changing = true)
import static org.ratpackframework.groovy.RatpackScript.ratpack
import static org.ratpackframework.routing.Handlers.assets
import org.ratpackframework.groovy.templating.TemplateRenderer

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
   routing {
       get("") {
           response.send "This is the app root (also try: /date and /some.txt)"
       }

       get("date") {
           context.get(TemplateRenderer).render("date.html")
       }

	   route assets("public")
   }
}
