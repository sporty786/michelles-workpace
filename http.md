HTTP REQUEST
URL - location of the file on the internet
VERB (GET, POST, PUT, PATCH, DELETE) - description of the action we'd like to take
    - the verbs by themselves don't actually do anything - they're just descriptive, but they can lead to a 
    - server taking different actions
HEADERS - metadata about the request (eg, the length and type of the body)
BODY - information that is sent in the request

HTTP RESPONSE
STATUS CODE - eg 200, 404, 301, 500, etc.
HEADERS - metadata about the response
BODY - information that is sent in a response

It is the responsibility of a server to deliver an appropriate HTTP response to an HTTP request

API - application programming interface - a tool that a program can easily use
Web API - a web-based tool for delivering information or performing actions based on communication over the internet

100 purely informational
200 'OK' status codes (the server is acting as expected)
    - eg 200 ('OK')
300 redirection codes
400 clients error (the entity sending the HTTP request did something wrong) 
    - 400 (generally malformed request, such as the HTTP request body not containing the right structure of information)
    - 401 (unauthorized, eg a failed login or authentication)
    - 404 (missing resource/file)
500 server error (the server producing the HTTP response did something wrong)
    - 500 (in a Java server, this basically always means some exception was thrown, especially a SQL exception)
        -> Should never get in a properly designed server

request/response bodies are very often written in a format called JSON - JavaScript Object Notations - universal, 
lightweight data interchange format (useful way to send data that everyone more or less understands)

Examples: meowfacts.herokuapp.com, pokemon api

Can use postman extension to send GET requests, etc; not really able to connect wtih gitpod though.


From last week:
To set up a maven project in gitpod, right click in left explorer panel, select Create New Maven Project, then an
archetype (quickstart), some version of maven (1.4?), group id (com.revature; name of organization, doesn't really matter),
demo (name of the application), location (can leave as default), and will automatically generate a brand new maven project for you.
Extensions installed in gitpod VS Code:
    Debugger for Java
    Extension Pack for Java
    Language Support for Java(TM)
    Maven for Java
    Project Manager for Java
    Test Runner for Java