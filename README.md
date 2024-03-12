# Theme application issue

This is a regular vaadin starter with spring and gradle. The only changes should be:

- Added a theme "my-own-theme" that applies a yellowish background to everything
- Added a webcomponent exporter for the main view
- Added a spring configuration that allows cors
- Added a hostPage/index.html for embedding the webcomponent; I have `python3 -m http.server` running there for serving this index.html on port 8000  

In AppShell.java, there is this annotation: `@Theme(value = "my-own-theme", themeClass = MyOwnTheme.class)`

There are two possible outcomes when you begin with a clean repository (`./gradlew vaadinClean`)

(1) Start the DemoApplication, e.g. using a run configuration in IntelliJ. The application starts fine and on both, localhost:8080 (the vaadin-hosted) and localhost:8000 (the embedded) variant I see the yellowish background of "my-own-theme". But at the same time, I see Lumo-Styling applied to e.g. the <body> element of both browsers.

(2) Build the frontend using `./gradlew vaadinBuildFrontend`. This task fails with the error message

```
com.vaadin.flow.server.ExecutionFailedException: Error occured during goal execution: Theme name and theme class can not both be specified. Theme name uses Lumo and can not be used in combination with custom theme class.
```
