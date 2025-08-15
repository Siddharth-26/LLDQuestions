# Configurable Report Gen.
Requirements : 
 - Customer builds a report response via our library.
 - Then it uses our GenerationHandler class's generate(Request response) function to return the required report in proper format based on the configuration that is set by the client themselves.
 - So prior to all of this the first step should be configuration class that is set before starting the program...
 - This configuration should be a singleton and there would be only certain allowed methods.
