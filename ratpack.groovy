// See https://github.com/ratpack/ratpack/blob/netty/ratpack-groovy/src/main/groovy/org/ratpackframework/groovy/app/Routing.groovy

get("/") {
	text "This is the app root (also try: /date and /some.txt)"
}
get("/date") {
	render "date.html"
}