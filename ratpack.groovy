@Grab("io.ratpack:ratpack-groovy:1.3.3")
import static ratpack.groovy.Groovy.ratpack
import static ratpack.groovy.Groovy.groovyMarkupTemplate
import ratpack.groovy.template.MarkupTemplateModule

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
    bindings {
        module MarkupTemplateModule
    }
    handlers {
        get {
            response.send "This is the app root (also try: /date and /some.txt)"
        }

        get("date") {
            render groovyMarkupTemplate("date.gtpl")
        }

        files { dir "public" }
    }
}
