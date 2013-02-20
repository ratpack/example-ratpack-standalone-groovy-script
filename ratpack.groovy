get("/") {
	text "This is the app root (also try: /date and /some.txt)"
}
get("/date") {
	render "date.html"
}